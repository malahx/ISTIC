package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.BaseEntity;

import java.util.Map;

public interface Repository<T extends BaseEntity, U> {

    T findById(U id);
    T save(T object);
    T save(T object, SaveType type);
    T update(U id, Map<String, Object> fields);
    void delete(T object);
    void delete(U id);

    void commit();
    void rollback();

    enum SaveType {
        COMMIT,
        BEGIN,
        ROLLBACK,
        NOTHING
    }

}
