package fr.istic.malah.tp2.service;

import fr.istic.malah.tp2.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static fr.istic.malah.tp2.TestData.somePerson;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsInstanceOf.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DAOServiceTest {

    private DAOService service;

    @Mock
    private EntityManager mockEntityManager;

    @Mock
    private TypedQuery<Person> mockQuery;

    @Before
    public void setUp() {
        service = new DAOService(mockEntityManager);
    }

    @Test
    public void shouldInitializeData() {

        ArgumentCaptor<Person> personArgumentCaptor = ArgumentCaptor.forClass(Person.class);
        doNothing().when(mockEntityManager).persist(personArgumentCaptor.capture());

        TypedQuery<Person> mockQuery = mock(TypedQuery.class);
        when(mockQuery.getResultList()).thenReturn(new ArrayList<>());
        when(mockEntityManager.createQuery(anyString(), eq(Person.class))).thenReturn(mockQuery);

        service.initializeData();

        verify(mockEntityManager).persist(personArgumentCaptor.getValue());

        assertThat(personArgumentCaptor.getValue(), notNullValue());
        assertThat(personArgumentCaptor.getValue().getFirstName(), equalTo("Pierre"));
        assertThat(personArgumentCaptor.getValue().getLastName(), equalTo("Jean"));
        assertThat(personArgumentCaptor.getValue().getCity(), notNullValue());
        assertThat(personArgumentCaptor.getValue().getCity().getName(), equalTo("Paris"));

    }

    @Test
    public void shouldNotInitializeDataIfAlreadyIn() {

        when(mockQuery.getResultList()).thenReturn(Collections.singletonList(new Person()));
        when(mockEntityManager.createQuery(anyString(), eq(Person.class))).thenReturn(mockQuery);

        service.initializeData();

        verify(mockEntityManager, times(0)).persist(any(Person.class));
        verify(mockEntityManager).createQuery("SELECT p FROM Person as p", Person.class);

    }

    @Test
    public void shouldFindPersons() {

        List<Person> people = Collections.singletonList(somePerson());

        when(mockQuery.getResultList()).thenReturn(people);
        when(mockEntityManager.createQuery(anyString(), eq(Person.class))).thenReturn(mockQuery);

        List<Person> result = service.findAllPersons();

        verify(mockEntityManager).createQuery("SELECT p FROM Person as p", Person.class);

        assertThat(result, equalTo(people));

    }
}
