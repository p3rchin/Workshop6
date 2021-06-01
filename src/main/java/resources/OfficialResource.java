package resources;

import resources.pojos.Official;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/officers/{username}")
public class OfficialResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Official official) {

        return Response.ok()
                .entity(official)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("username") String username) {

        return Response.noContent()
                .build();
    }
}
