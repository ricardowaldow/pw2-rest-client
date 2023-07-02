package dev.rpmhub;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient
public interface ServiceB {

    @GET
    @Path("/person/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    Person getPerson(@PathParam("name") String name);

}
