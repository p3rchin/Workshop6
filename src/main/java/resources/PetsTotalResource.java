package resources;

import resources.pojos.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets/{parametro}")
public class PetsTotalResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("parametro") String parametro) {

        List<Pet> pets = new ArrayList<Pet>();
        List<Pet> pets1 = new ArrayList<Pet>();
        Integer total = 0;
        pets.add(new Pet(1, 12345, "Friga", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));
        pets.add(new Pet(1, 12346, "Dingo", "FELINO",  "EMPERADOR", "PEQUENIO", "MACHO", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));

        for (int i = 0; i < pets.size(); i++) {
            if(parametro.equals(String.valueOf(pets.get(i).getMicrochip()))){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(pets.get(i).getSpecies())){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(pets.get(i).getRace())){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(String.valueOf(pets.get(i).getSize()))){
                pets1.add(pets.get(i));
            }
            if(parametro.equals(String.valueOf(pets.get(i).getSex()))){
                pets1.add(pets.get(i));
            }
        }
        total = pets1.size();
        return Response.ok()
                .entity(total)
                .build();
    }
}
