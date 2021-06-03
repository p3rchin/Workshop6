package resources;

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
    public Response list(@PathParam("ownerId") Integer ownerId, @QueryParam("pet_id") String pet_id, @QueryParam("microchip") String microchip, @QueryParam("name") String name, @QueryParam("species") String species, @QueryParam("race") String race, @QueryParam("size") String size, @QueryParam("sex") String sex) {

        List<Pet> pets = new ArrayList<Pet>();
        List<Pet> pets1 = new ArrayList<Pet>();
        pets.add(new Pet(1, 12345, "Friga", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", ownerId));
        pets.add(new Pet(2, 12346, "Dingo", "FELINO",  "EMPERADOR", "PEQUENIO", "MACHO", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", ownerId));

        for (int i = 0; i < pets.size(); i++) {
            if(pet_id != null){
                if(pet_id.equals(String.valueOf(pets.get(i).getPetId()))){
                    pets1.add(pets.get(i));
                }
            }
            if(microchip!=null){
                if(microchip.equals(String.valueOf(pets.get(i).getMicrochip()))){
                    pets1.add(pets.get(i));
                }
            }
            if(name!=null){
                if(name.equals(pets.get(i).getName())){
                    pets1.add(pets.get(i));
                }
            }
            if(species!=null){
                if(species.equals(pets.get(i).getSpecies())){
                    pets1.add(pets.get(i));
                }
            }
            if(race!=null){
                if(race.equals(String.valueOf(pets.get(i).getRace()))){
                    pets1.add(pets.get(i));
                }
            }
            if(size!=null){
                if(size.equals(String.valueOf(pets.get(i).getSize()))){
                    pets1.add(pets.get(i));
                }
            }
            if(sex!=null){
                if(sex.equals(String.valueOf(pets.get(i).getSex()))){
                    pets1.add(pets.get(i));
                }
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
