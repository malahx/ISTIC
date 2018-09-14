package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.exception.RepositoryException;
import fr.istic.malah.tp2.model.BaseEntity;
import fr.istic.malah.tp2.model.Person;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.Map;

import static fr.istic.malah.tp2.config.ModelDataDefinition.NAME;

@AllArgsConstructor
public abstract class BaseRepository<T extends BaseEntity> implements Repository<T, Long> {

    static final String NO_ID = "No id";
    static final String NO_OBJECT = "No object";
    static final String NO_COMMIT = "No commit initialized";
    static final String NO_UPDATE = "No update";

    protected Class<T> clazz;

    protected String table;

    protected EntityManager entityManager;

    @Override
    public T findById(Long id) {
        return entityManager.find(clazz, id);
    }

    @Override
    public T findOneByString(String field, String value) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        ParameterExpression<String> parameter = criteriaBuilder.parameter(String.class);
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        criteriaQuery.select(root).where(criteriaBuilder.like(root.get(field), parameter));
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        query.setParameter(parameter, value);
        return query.getSingleResult();
    }

    @Override
    public T save(T object) {
        entityManager.persist(object);
        return object;
    }

    @Override
    public T save(T object, SaveType type) {
        if (type == SaveType.BEGIN) {
            entityManager.getTransaction().begin();
        }
        T save = save(object);
        if (type == SaveType.COMMIT) {
            entityManager.getTransaction().commit();
        }
        return save;
    }

    @Override
    public T update(Long id, Map<String, Object> fields) {
        StringBuilder field = new StringBuilder();
        fields.forEach((k, v) -> field.append(k).append("=:").append(k).append(","));
        field.deleteCharAt(field.length() - 1);
        Query query = entityManager.createNativeQuery("UPDATE " + table + " SET " + field + " WHERE id=:id");
        fields.forEach(query::setParameter);
        query.setParameter("id", id);
        if (query.executeUpdate() == 0) {
            throw new RepositoryException(NO_UPDATE);
        }
        return entityManager.find(clazz, id);
    }

    @Override
    public void delete(T object) {
        if (object == null) {
            throw new RepositoryException(NO_OBJECT);
        }
        entityManager.remove(object);
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            throw new RepositoryException(NO_ID);
        }
        entityManager.createQuery("DELETE FROM " + clazz.getSimpleName() + " o WHERE o.id=:id").setParameter("id", id).executeUpdate();
    }

    @Override
    public void commit() {
        if (entityManager.getTransaction() == null || entityManager.getTransaction().isActive()) {
            throw new RepositoryException(NO_COMMIT);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void rollback() {
        if (entityManager.getTransaction() == null || !entityManager.getTransaction().isActive()) {
            throw new RepositoryException(NO_COMMIT);
        }
        entityManager.getTransaction().rollback();
    }
}
