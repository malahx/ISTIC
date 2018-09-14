package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.Person;

import javax.persistence.EntityManager;

public class PersonRepository extends BaseRepository<Person> {

    public PersonRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
