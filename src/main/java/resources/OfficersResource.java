package resources;

import resources.pojos.Author;
import resources.pojos.Official;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/officers")
public class OfficersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Official> officers = new ArrayList<Official>();
        officers.add(new Official("Focus", "Robinson José Gutiérrez Solano"));
        officers.add(new Official("Perchin", "Fabian Camilo Gómez Cespedes"));

        return Response.ok()
                .entity(officers)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Official official) {

        official.setUsername("Yesverywell");

        return Response.status(Response.Status.CREATED)
                .entity(official)
                .build();
    }
}
