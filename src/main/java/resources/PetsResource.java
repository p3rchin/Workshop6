package resources;

import resources.pojos.Book;
import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{ownerId}/pets")
public class PetsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("ownerId") Integer ownerId) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(1, 12345, "Friga", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", ownerId));

        return Response.ok()
                .entity(pets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("ownerId") Integer ownerId, Pet pet) {

        pet.setPetId(3);

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }
}
