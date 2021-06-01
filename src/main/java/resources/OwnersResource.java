package resources;

import resources.pojos.Owner;

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

        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá"));
        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá"));
        owners.add(new Owner("perchin", 2, "Robinson Gutierrez", "hola2@hotmail.com", "USAQUEN"));


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
