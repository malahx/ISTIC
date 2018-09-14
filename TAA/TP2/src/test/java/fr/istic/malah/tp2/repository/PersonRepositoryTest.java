package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import static fr.istic.malah.tp2.TestData.somePerson;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonRepositoryTest {

    private PersonRepository repository;

    @Mock
    private EntityManager mockEntityManager;

    @Before
    public void setUp() {
        repository = new PersonRepository(mockEntityManager);
    }

    @Test
    public void shouldSaveAPerson() {

        Person person = somePerson();

        Person result = repository.save(person);

        verify(mockEntityManager).persist(person);

        assertThat(result, equalTo(person));
    }

    @Test
    public void shouldSaveAPersonWithBegin() {

        Person person = somePerson();

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        Person result = repository.save(person, Repository.SaveType.BEGIN);

        verify(mockEntityManager).persist(person);
        verify(mockTransaction).begin();

        assertThat(result, equalTo(person));
    }

    @Test
    public void shouldSaveAPersonWithCommit() {

        Person person = somePerson();

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        Person result = repository.save(person, Repository.SaveType.BEGIN);

        verify(mockEntityManager).persist(person);
        verify(mockTransaction).commit();

        assertThat(result, equalTo(person));
    }
}
