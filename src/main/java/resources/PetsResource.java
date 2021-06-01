package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{ownerId}/pets/{parametro}")
public class PetsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("ownerId") Integer ownerId, @PathParam("parametro") String parametro) {

        List<Pet> pets = new ArrayList<Pet>();
        List<Pet> pets1 = new ArrayList<Pet>();
        pets.add(new Pet(1, 12345, "Friga", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", ownerId));
        pets.add(new Pet(1, 12346, "Dingo", "FELINO",  "EMPERADOR", "PEQUENIO", "MACHO", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", ownerId));

        for (int i = 0; i < pets.size(); i++) {
            if(parametro.equals(String.valueOf(pets.get(i).getMicrochip()))){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(pets.get(i).getName())){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(pets.get(i).getSpecies())){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(String.valueOf(pets.get(i).getRace()))){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(String.valueOf(pets.get(i).getSize()))){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(String.valueOf(pets.get(i).getSex()))){
                pets1.add(pets.get(i));
            }
        }
        return Response.ok()
                .entity(pets1)
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
