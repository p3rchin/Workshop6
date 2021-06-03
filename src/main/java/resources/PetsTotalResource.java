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

@Path("/pets")
public class PetsTotalResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Pet> pets = new ArrayList<Pet>();
        List<TotalPets> totalPets = new ArrayList<TotalPets>();
        String[] species = {"CANINO", "FELINO"};
        String[] race = {"LABRADOR", "EMPERADOR"};
        String[] size = {"PEQUENIO", "MEDIANO", "GRANDE", "MUY GRANDE"};
        String[] sex = {"MACHO", "HEMBRA"};
        String[] sterilized = {"SI", "NO"};

        pets.add(new Pet(1, 12345, "Friga", "CANINO", "LABRADOR", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1,"NO"));
        pets.add(new Pet(1, 12346, "Dingo", "CANINO", "EMPERADOR", "PEQUENIO", "MACHO", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1, "SI"));


        for (int i = 0; i < species.length; i++) {
            List<Pet> pets1 = new ArrayList<Pet>();
            for (int j = 0; j < pets.size(); j++) {
                if (species[i].equals(pets.get(j).getSpecies())) {
                    pets1.add(pets.get(j));
                }
            }
            totalPets.add(new TotalPets("total mascotas por especie " + species[i] + " es de " + (pets1.size()), pets1));
        }


        for (int i = 0; i < race.length; i++) {
            List<Pet> pets1 = new ArrayList<Pet>();
            for (int j = 0; j < pets.size(); j++) {
                if (race[i].equals(pets.get(j).getRace())) {
                    pets1.add(pets.get(j));
                }
            }
            totalPets.add(new TotalPets("total mascotas por raza " + race[i] + " es de " + (pets1.size()), pets1));
        }


        for (int i = 0; i < size.length; i++) {
            List<Pet> pets1 = new ArrayList<Pet>();
            for (int j = 0; j < pets.size(); j++) {
                if (size[i].equals(pets.get(j).getSize())) {
                    pets1.add(pets.get(j));
                }
            }
            totalPets.add(new TotalPets("total mascotas por tamaño " + size[i] + " es de " + (pets1.size()), pets1));
        }


        for (int i = 0; i < sex.length; i++) {
            List<Pet> pets1 = new ArrayList<Pet>();
            for (int j = 0; j < pets.size(); j++) {
                if (sex[i].equals(pets.get(j).getSex())) {
                    pets1.add(pets.get(j));
                }
            }
            totalPets.add(new TotalPets("total mascotas por tamaño " + sex[i] + " es de " + (pets1.size()), pets1));
        }

        for (int i = 0; i < sterilized.length; i++) {
            List<Pet> pets1 = new ArrayList<Pet>();
            for (int j = 0; j < pets.size(); j++) {
                if (sterilized[i].equals(pets.get(j).getSterilized())) {
                    pets1.add(pets.get(j));
                }
            }
            totalPets.add(new TotalPets("total mascotas por esterelizacion " + sterilized[i] + " es de " + (pets1.size()), pets1));
        }

        return Response.ok()
                .entity(totalPets)
                .build();
    }
}
