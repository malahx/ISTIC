package fr.istic.malah.tp2.service;

import fr.istic.malah.tp2.EntityManagerHelper;
import fr.istic.malah.tp2.model.Person;
import org.junit.Test;

import javax.persistence.FlushModeType;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class DAOServiceIT {

    @Test
    public void shouldInitiliazeAndFoundData() {
        EntityManagerHelper.getEntityManager().setFlushMode(FlushModeType.AUTO);
        DAOService daoService = new DAOService(EntityManagerHelper.getEntityManager());
        daoService.initializeData();
        List<Person> allPersons = daoService.findAllPersons();
        assertThat(allPersons, hasSize(1));
        Person person = allPersons.get(0);
        assertThat(person, notNullValue());
        assertThat(person.getFirstName(), equalTo("Pierre"));
        assertThat(person.getLastName(), equalTo("Jean"));
        assertThat(person.getCity(), notNullValue());
        assertThat(person.getCity().getName(), equalTo("Paris"));
    }
}
