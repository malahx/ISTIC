package fr.istic.taa.malah.tp3.repository;

import fr.istic.taa.malah.tp3.model.Spaceship;

import java.util.List;

public interface SpaceshipRepository {
    Spaceship findByName(String name);
    List<Spaceship> findAll();
    Spaceship save(Spaceship spaceship);
}
