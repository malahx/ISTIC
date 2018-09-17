package fr.istic.taa.malah.tp3.repository.impl;

import fr.istic.taa.malah.tp3.model.People;
import fr.istic.taa.malah.tp3.repository.PeopleRepository;

import java.util.ArrayList;
import java.util.List;

public class FakePeopleRepository implements PeopleRepository {

    private List<People> peoples = new ArrayList<>();

    public People findByName(String name) {
        return name == null ? null : peoples.stream().filter(p -> p != null && name.equals(p.getName())).findFirst().orElse(null);
    }

    public List<People> findAll() {
        return peoples;
    }

    public People save(People people) {
        peoples.add(people);
        return people;
    }
}
