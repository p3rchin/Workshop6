package resources;

import resources.pojos.Case;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pets/{petId}/cases/{id}")
public class CaseResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("petId") Integer petId, @PathParam("id") Integer id, Case casse) {

        return Response.ok()
                .entity(casse)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("petId") Integer petId, @PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }
}
