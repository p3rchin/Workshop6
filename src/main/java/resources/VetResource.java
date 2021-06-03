package resources;

import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets/{username}")
public class VetResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {

        return Response.ok()
                .entity(vet)
                .build();
    }
}
