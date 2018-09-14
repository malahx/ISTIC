package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.BaseEntity;

public interface Repository<T extends BaseEntity> {

    T findById(long id);
    T save(T object);
    T save(T object, SaveType type);
    boolean delete(T object);

    enum SaveType {
        COMMIT,
        BEGIN,
        ROLLBACK,
        NOTHING
    }

}
