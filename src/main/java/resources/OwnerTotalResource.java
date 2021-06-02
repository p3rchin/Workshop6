package resources;

import resources.pojos.Owner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/ownersTotal/{parametro}")
public class OwnerTotalResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("parametro") String parametro) {

        List<Owner> owners = new ArrayList<Owner>();
        List<Owner> owners1 = new ArrayList<Owner>();

        Integer total = 0;
//        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá"));
//        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Bogotá"));
//        owners.add(new Owner("perchin", 2, "Robinson Gutierrez", "hola2@hotmail.com", "USAQUEN"));


        for (int i = 0; i < owners.size(); i++) {
            if(parametro.equals(owners.get(i).getNeighborhood())){
                owners1.add(owners.get(i));
            }
         }
        total = owners1.size();
        return Response.ok()
                .entity(total)
                .build();
    }
}
