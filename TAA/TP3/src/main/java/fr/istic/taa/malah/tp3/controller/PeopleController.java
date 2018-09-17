package fr.istic.taa.malah.tp3.controller;

import fr.istic.taa.malah.tp3.model.People;
import fr.istic.taa.malah.tp3.service.PeopleService;
import lombok.AllArgsConstructor;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@AllArgsConstructor
@Path("/people")
public class PeopleController {

    private PeopleService peopleService;

    public PeopleController() {
        this.peopleService = new PeopleService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<People> getPeoples() {
        return peopleService.getPeoples();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public People getPeople(@PathParam("name") String name) {
        return peopleService.getPeople(name);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public People createPeople(People people) {
        return peopleService.createPeople(people);
    }
}
