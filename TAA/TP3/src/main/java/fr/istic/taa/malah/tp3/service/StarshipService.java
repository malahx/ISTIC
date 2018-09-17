package fr.istic.taa.malah.tp3.service;

import fr.istic.taa.malah.tp3.model.Spaceship;
import fr.istic.taa.malah.tp3.repository.SpaceshipRepository;
import fr.istic.taa.malah.tp3.repository.impl.FakeSpaceshipRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class StarshipService {

    private SpaceshipRepository spaceshipRepository;

    public StarshipService() {
        this.spaceshipRepository = new FakeSpaceshipRepository();
    }

    public Spaceship getPeople(String name) {
        return spaceshipRepository.findByName(name);
    }

    public List<Spaceship> getPeoples() {
        return spaceshipRepository.findAll();
    }

    public Spaceship createPeople(Spaceship people) {
        return spaceshipRepository.save(people);
    }
}
