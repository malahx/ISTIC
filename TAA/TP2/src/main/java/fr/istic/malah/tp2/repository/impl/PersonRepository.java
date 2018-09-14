package fr.istic.malah.tp2.repository.impl;

import fr.istic.malah.tp2.model.Person;
import fr.istic.malah.tp2.repository.BaseRepository;

import javax.persistence.EntityManager;

import static fr.istic.malah.tp2.config.ModelDataDefinition.NAME;
import static fr.istic.malah.tp2.config.ModelDataDefinition.PERSON;

public class PersonRepository extends BaseRepository<Person> {

    public PersonRepository(EntityManager entityManager) {
        super(Person.class, PERSON, entityManager);
    }

    public Person findByName(String name) {
        return findOneByString(NAME, name);
    }
}