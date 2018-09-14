package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.exception.RepositoryException;
import fr.istic.malah.tp2.model.Person;
import fr.istic.malah.tp2.repository.impl.PersonRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.Map;

import static fr.istic.malah.tp2.TestData.ID;
import static fr.istic.malah.tp2.TestData.SOME_STRING;
import static fr.istic.malah.tp2.TestData.somePerson;
import static fr.istic.malah.tp2.repository.BaseRepository.NO_UPDATE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BaseRepositoryTest {

    private PersonRepository repository;

    @Mock
    private EntityManager mockEntityManager;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

        Person result = repository.save(person, Repository.SaveType.COMMIT);

        verify(mockEntityManager).persist(person);
        verify(mockTransaction).commit();

        assertThat(result, equalTo(person));
    }

    @Test
    public void shouldCommitATransaction() {

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);
        when(mockTransaction.isActive()).thenReturn(false);

        repository.commit();

        verify(mockTransaction).commit();
    }

    @Test
    public void shouldThrowExceptionWhenCommitAnActiveTransaction() {

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);
        when(mockTransaction.isActive()).thenReturn(true);

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(BaseRepository.NO_COMMIT);

        repository.commit();
    }

    @Test
    public void shouldRollbackATransaction() {

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);
        when(mockTransaction.isActive()).thenReturn(true);

        repository.rollback();

        verify(mockTransaction).rollback();
    }

    @Test
    public void shouldThrowExceptionWhenRollbackAnActiveTransaction() {

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);
        when(mockTransaction.isActive()).thenReturn(false);

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(BaseRepository.NO_COMMIT);

        repository.rollback();
    }

    @Test
    public void shouldFindById() {

        Person person = somePerson();
        when(mockEntityManager.find(any(), any())).thenReturn(person);

        Person result = repository.findById(ID);

        verify(mockEntityManager).find(Person.class, ID);

        assertThat(result, notNullValue());
        assertThat(result, equalTo(person));
    }

    @Test
    public void shouldDeleteById() {

        Query mockQuery = mock(Query.class);
        when(mockEntityManager.createQuery(anyString())).thenReturn(mockQuery);
        when(mockQuery.setParameter(anyString(), any())).thenReturn(mockQuery);
        when(mockQuery.executeUpdate()).thenReturn(1);

        repository.delete(ID);

        verify(mockEntityManager).createQuery("DELETE FROM Person o WHERE o.id=:id");
        verify(mockQuery).setParameter("id", ID);
        verify(mockQuery).executeUpdate();
    }

    @Test
    public void shouldThrowExceptionWhenDeleteByIdANullId() {

        Long id = null;

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(BaseRepository.NO_ID);

        repository.delete(id);
    }

    @Test
    public void shouldDeleteByObject() {

        Person person = somePerson();

        repository.delete(person);

        verify(mockEntityManager).remove(person);
    }

    @Test
    public void shouldThrowExceptionWhenDeleteANullObject() {

        Person person = null;

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(BaseRepository.NO_OBJECT);

        repository.delete(person);
    }

    @Test
    public void shouldUpdateFields() {

        Map<String, Object> fields = new HashMap<>();
        fields.put("field1", SOME_STRING);
        fields.put("field2", SOME_STRING + 1);

        Person person = somePerson();

        Query mockQuery = mock(Query.class);
        when(mockEntityManager.createNativeQuery(anyString())).thenReturn(mockQuery);
        when(mockQuery.executeUpdate()).thenReturn(1);
        when(mockEntityManager.find(any(), any())).thenReturn(person);

        Person update = repository.update(ID, fields);

        verify(mockEntityManager).createNativeQuery("UPDATE person SET field1=:field1,field2=:field2 WHERE id=:id");
        verify(mockQuery).setParameter("id", ID);
        verify(mockQuery).setParameter("field1", SOME_STRING);
        verify(mockQuery).setParameter("field2", SOME_STRING + 1);
        verify(mockQuery).executeUpdate();
        verify(mockEntityManager).find(Person.class, ID);

        assertThat(update, notNullValue());
        assertThat(update, equalTo(person));
    }

    @Test
    public void shouldThrownExceptionWhenUpdateFieldsWithout() {

        Map<String, Object> fields = new HashMap<>();
        fields.put("field1", SOME_STRING);
        fields.put("field2", SOME_STRING + 1);

        Query mockQuery = mock(Query.class);
        when(mockEntityManager.createNativeQuery(anyString())).thenReturn(mockQuery);
        when(mockQuery.executeUpdate()).thenReturn(0);

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(NO_UPDATE);

        repository.update(ID, fields);
    }
}
