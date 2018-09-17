package fr.istic.taa.malah.tp3;

import fr.istic.taa.malah.tp3.controller.PeopleController;
import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        UndertowJaxrsServer ut = new UndertowJaxrsServer();

        ut.deploy(new Application() {
            @Override
            public Set<Class<?>> getClasses() {
                final Set<Class<?>> clazzes = new HashSet<>();
                clazzes.add(PeopleController.class);
                return clazzes;
            }
        });

        ut.start(Undertow.builder().addHttpListener(8080, "localhost"));
    }
}
