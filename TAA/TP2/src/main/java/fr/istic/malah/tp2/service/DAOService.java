package fr.istic.malah.tp2.service;

import fr.istic.malah.tp2.model.City;
import fr.istic.malah.tp2.model.Person;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@AllArgsConstructor
public class DAOService {

    private EntityManager entityManager;

    public void initializeData() {
        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person as p", Person.class);

        if (query == null || query.getResultList() == null || query.getResultList().size() != 0) {
            return;
        }
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        City city = new City();
        city.setName("Paris");
        Person person = new Person();
        person.setFirstName("Pierre");
        person.setLastName("Jean");
        person.setCity(city);
        entityManager.persist(city);
        entityManager.persist(person);
        transaction.commit();
    }

    public List<Person> findAllPersons() {
        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person as p", Person.class);
        return query.getResultList();
    }
}
