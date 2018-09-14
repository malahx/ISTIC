package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.exception.RepositoryException;
import fr.istic.malah.tp2.model.BaseEntity;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Map;

@AllArgsConstructor
public class BaseRepository<T extends BaseEntity> implements Repository<T, Long> {

    static final String NO_ID = "No id";
    static final String NO_OBJECT = "No object";
    static final String NO_COMMIT = "No commit initialized";

    private Class<T> clazz;

    private String table;

    private EntityManager entityManager;

    @Override
    public T findById(Long id) {
        return entityManager.find(clazz, id);
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
        Query nativeQuery = entityManager.createNativeQuery("UPDATE " + table + " SET " + field + " WHERE id=:id");
        nativeQuery.setParameter("id", id);
        fields.forEach(nativeQuery::setParameter);
        nativeQuery.executeUpdate();
        return null;
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
