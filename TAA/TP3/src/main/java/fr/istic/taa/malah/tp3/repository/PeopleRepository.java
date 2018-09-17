package fr.istic.taa.malah.tp3.repository;

import fr.istic.taa.malah.tp3.model.People;

import java.util.List;

public interface PeopleRepository {
    People findByName(String name);
    List<People> findAll();
    People save(People people);
}
