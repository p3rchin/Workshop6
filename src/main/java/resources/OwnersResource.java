package resources;

import resources.pojos.Author;
import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners")
public class OwnersResource {
    List<Owner> owners = new ArrayList<Owner>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {


        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá"));


        return Response.ok()
                .entity(owners)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {

        owners.add(owner);

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }
}
