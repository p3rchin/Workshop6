package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/owners/{id}")
public class OwnerResorce {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, Owner owner) {

        return Response.ok()
                .entity(owner)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }
}
