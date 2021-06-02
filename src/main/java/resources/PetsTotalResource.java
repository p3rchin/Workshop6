package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;
import resources.pojos.TotalOwners;
import resources.pojos.TotalPets;

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
        List<TotalPets> totalPets = new ArrayList<TotalPets>();
        String[] species = {"CANINO", "FELINO"};
        String[] race = {"LABRADOR", "LABRADOR"};
        String[] size = {"PEQUEÑO", "MEDIANO", "GRANDE", "MUY GRANDE"};

        pets.add(new Pet(1, 12345, "Friga", "CANINO",  "LABRADOR", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));
        pets.add(new Pet(1, 12346, "Dingo", "CANINO",  "EMPERADOR", "PEQUENIO", "MACHO", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));

        if(parametro.equals("especie")){
            for (int i = 0; i < species.length; i++) {
                List<Pet> pets1 = new ArrayList<Pet>();
                for (int j = 0; j < pets.size(); j++) {
                    if (species[i].equals(pets.get(j).getSpecies())){
                        pets1.add(pets.get(j));
                    }
                }
                totalPets.add(new TotalPets("total mascotas por especie " + species[i] + " es de " +(pets1.size()), pets1));
            }

        }
        return Response.ok()
                .entity(totalPets)
                .build();
    }
}
