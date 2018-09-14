package fr.istic.malah.tp2;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {


    @Test
    public void shouldConnectToDev() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();

        manager.close();
        factory.close();
    }

}
