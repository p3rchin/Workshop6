package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/owners/{ownerId}/pets/{id}")
public class PetResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("ownerId") Integer ownerId, @PathParam("id") Integer id, Pet pet) {

        return Response.ok()
                .entity(pet)
                .build();
    }

}
