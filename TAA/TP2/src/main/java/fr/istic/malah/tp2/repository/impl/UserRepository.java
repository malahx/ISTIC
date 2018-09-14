package fr.istic.malah.tp2.repository.impl;

import fr.istic.malah.tp2.model.User;
import fr.istic.malah.tp2.repository.BaseRepository;

import javax.persistence.EntityManager;

import static fr.istic.malah.tp2.config.DAODataDefinition.LAST_NAME;
import static fr.istic.malah.tp2.config.DAODataDefinition.USER;

public class UserRepository extends BaseRepository<User> {

    public UserRepository(EntityManager entityManager) {
        super(User.class, USER, entityManager);
    }

    public User findByLastName(String lastName) {
        return findOneByString(LAST_NAME, lastName);
    }
}