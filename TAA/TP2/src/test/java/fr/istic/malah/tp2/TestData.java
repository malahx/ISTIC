package fr.istic.malah.tp2;

import fr.istic.malah.tp2.model.Person;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class TestData {

    public static final long ID = 10L;
    public static String SOME_STRING = "some-string";

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static Person somePerson() {
        return FACTORY.manufacturePojo(Person.class);
    }

}
