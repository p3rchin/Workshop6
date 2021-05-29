
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/visits")
public class VisitsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Visit> visits = new ArrayList<Visit>();

        visits.add(new Visit(1, "hola", "General", "El perro está vomitado", 2, 3));


        return Response.ok()
                .entity(visits)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Visit visit) {

        return Response.status(Response.Status.CREATED)
                .entity(visit)
                .build();
    }
}