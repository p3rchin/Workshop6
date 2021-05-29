package resources;

import resources.pojos.Owner;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/vets")
public class VetsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Vet> vets = new ArrayList<Vet>();

        vets.add(new Vet("Focus", "Robinson Solano", "robinson21@gmail.com", "Barranquilla"));


        return Response.ok()
                .entity(vets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }
}
