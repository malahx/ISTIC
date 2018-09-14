package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.Person;

import javax.persistence.EntityManager;

import static fr.istic.malah.tp2.config.ModelDataDefinition.PERSON;

public class PersonRepository extends BaseRepository<Person> {

    public PersonRepository(EntityManager entityManager) {
        super(Person.class, PERSON, entityManager);
    }
}
