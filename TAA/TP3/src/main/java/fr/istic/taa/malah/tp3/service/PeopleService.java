package fr.istic.taa.malah.tp3.service;

import fr.istic.taa.malah.tp3.model.People;
import fr.istic.taa.malah.tp3.repository.PeopleRepository;
import fr.istic.taa.malah.tp3.repository.impl.FakePeopleRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PeopleService {

    private PeopleRepository peopleRepository;

    public PeopleService() {
        this.peopleRepository = new FakePeopleRepository();
    }

    public People getPeople(String name) {
        return peopleRepository.findByName(name);
    }

    public List<People> getPeoples() {
        return peopleRepository.findAll();
    }

    public People createPeople(People people) {
        return peopleRepository.save(people);
    }
}
