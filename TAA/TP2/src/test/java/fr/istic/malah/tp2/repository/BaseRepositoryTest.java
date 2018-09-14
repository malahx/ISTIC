package fr.istic.malah.tp2.repository;

import fr.istic.malah.tp2.exception.RepositoryException;
import fr.istic.malah.tp2.model.User;
import fr.istic.malah.tp2.repository.impl.UserRepository;
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
import static fr.istic.malah.tp2.TestData.someUser;
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

    private UserRepository repository;

    @Mock
    private EntityManager mockEntityManager;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        repository = new UserRepository(mockEntityManager);
    }

    @Test
    public void shouldSaveAPerson() {

        User user = someUser();

        User result = repository.save(user);

        verify(mockEntityManager).persist(user);

        assertThat(result, equalTo(user));
    }

    @Test
    public void shouldSaveAPersonWithBegin() {

        User user = someUser();

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        User result = repository.save(user, Repository.SaveType.BEGIN);

        verify(mockEntityManager).persist(user);
        verify(mockTransaction).begin();

        assertThat(result, equalTo(user));
    }

    @Test
    public void shouldSaveAPersonWithCommit() {

        User user = someUser();

        EntityTransaction mockTransaction = mock(EntityTransaction.class);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);

        User result = repository.save(user, Repository.SaveType.COMMIT);

        verify(mockEntityManager).persist(user);
        verify(mockTransaction).commit();

        assertThat(result, equalTo(user));
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

        User user = someUser();
        when(mockEntityManager.find(any(), any())).thenReturn(user);

        User result = repository.findById(ID);

        verify(mockEntityManager).find(User.class, ID);

        assertThat(result, notNullValue());
        assertThat(result, equalTo(user));
    }

    @Test
    public void shouldDeleteById() {

        Query mockQuery = mock(Query.class);
        when(mockEntityManager.createQuery(anyString())).thenReturn(mockQuery);
        when(mockQuery.setParameter(anyString(), any())).thenReturn(mockQuery);
        when(mockQuery.executeUpdate()).thenReturn(1);

        repository.delete(ID);

        verify(mockEntityManager).createQuery("DELETE FROM User o WHERE o.id=:id");
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

        User user = someUser();

        repository.delete(user);

        verify(mockEntityManager).remove(user);
    }

    @Test
    public void shouldThrowExceptionWhenDeleteANullObject() {

        User user = null;

        thrown.expect(RepositoryException.class);
        thrown.expectMessage(BaseRepository.NO_OBJECT);

        repository.delete(user);
    }

    @Test
    public void shouldUpdateFields() {

        Map<String, Object> fields = new HashMap<>();
        fields.put("field1", SOME_STRING);
        fields.put("field2", SOME_STRING + 1);

        User user = someUser();

        Query mockQuery = mock(Query.class);
        when(mockEntityManager.createNativeQuery(anyString())).thenReturn(mockQuery);
        when(mockQuery.executeUpdate()).thenReturn(1);
        when(mockEntityManager.find(any(), any())).thenReturn(user);

        User update = repository.update(ID, fields);

        verify(mockEntityManager).createNativeQuery("UPDATE person SET field1=:field1,field2=:field2 WHERE id=:id");
        verify(mockQuery).setParameter("id", ID);
        verify(mockQuery).setParameter("field1", SOME_STRING);
        verify(mockQuery).setParameter("field2", SOME_STRING + 1);
        verify(mockQuery).executeUpdate();
        verify(mockEntityManager).find(User.class, ID);

        assertThat(update, notNullValue());
        assertThat(update, equalTo(user));
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
