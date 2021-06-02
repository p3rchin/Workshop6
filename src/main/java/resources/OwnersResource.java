package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{parametro}")
public class OwnersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("parametro") String parametro) {

        List<Owner> owners = new ArrayList<Owner>();
        List<Owner> owners1 = new ArrayList<Owner>();
        List<Pet> pets1 = new ArrayList<Pet>();
        pets1.add(new Pet(1, 12345, "Friga", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));
        pets1.add(new Pet(1, 12345, "Dingo", "CANINO",  "Labrador", "MEDIANO", "HEMBRA", "https://www.ecestaticos.com/image/clipping/557/418/79776773aab795837282c7d4947abaf7/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg", 1));

        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá", pets1));
        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá", pets1));
        owners.add(new Owner("perchin", 2, "Robinson Gutierrez", "hola2@hotmail.com", "USAQUEN", pets1));


        for (int i = 0; i < owners.size(); i++) {
            if(parametro.equals(owners.get(i).getName())){
                owners1.add(owners.get(i));
            }
            if(parametro.equals(owners.get(i).getNeighborhood())){
                owners1.add(owners.get(i));
            }
            if(parametro.equals(String.valueOf(owners.get(i).getPersonId()))){
                owners1.add(owners.get(i));
            }
        }
        return Response.ok()
                .entity(owners1)
                .build();
    }
}
