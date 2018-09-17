package fr.istic.taa.malah.tp3.repository.impl;

import fr.istic.taa.malah.tp3.model.Spaceship;
import fr.istic.taa.malah.tp3.repository.SpaceshipRepository;

import java.util.ArrayList;
import java.util.List;

public class FakeSpaceshipRepository implements SpaceshipRepository {

    private List<Spaceship> spaceships = new ArrayList<>();

    public Spaceship findByName(String name) {
        return name == null ? null : spaceships.stream().filter(p -> p != null && name.equals(p.getName())).findFirst().orElse(null);
    }

    public List<Spaceship> findAll() {
        return spaceships;
    }

    public Spaceship save(Spaceship spaceship) {
        spaceships.add(spaceship);
        return spaceship;
    }
}
