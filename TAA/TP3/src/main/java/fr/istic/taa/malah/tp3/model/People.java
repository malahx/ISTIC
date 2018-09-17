package fr.istic.taa.malah.tp3.model;

import lombok.Data;

import java.util.List;

@Data
public class People {
    private String name;
    private List<Spaceship> spaceships;
}
