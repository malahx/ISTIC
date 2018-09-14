package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.BaseEntity;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public abstract class BaseRepository<T extends BaseEntity> implements Repository<T> {

    private EntityManager entityManager;

    @Override
    public T findById(long id) {
        return null;
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
    public boolean delete(T object) {
        return false;
    }
}
