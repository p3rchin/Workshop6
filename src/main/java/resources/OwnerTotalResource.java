package resources;

import resources.pojos.Owner;
import resources.pojos.TotalOwners;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Path("/ownersTotal")
public class OwnerTotalResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Owner> owners = new ArrayList<Owner>();
        List<TotalOwners> totalOwners = new ArrayList<TotalOwners>();

        String[] neighborhood = {"Antonio Nariño", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativá", "Fontibón", "Kennedy", "La Candelaria", "Los Martires", "Puente Aranda", "Rafael Uribe Uribe", "San Cristóbal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaquen", "Usme"};
        Integer total = 0;
        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Ciudad Bolivar", null));
        owners.add(new Owner("perchin", 1, "Fabián Gómez", "hola2@hotmail.com", "Ciudad Bolivar", null));
        owners.add(new Owner("perchin", 2, "Robinson Gutierrez", "hola2@hotmail.com", "Usaquen", null));
        owners.add(new Owner("perchin", 2, "Robinson Gutierrez", "hola2@hotmail.com", "Usaquen", null));

        for (int i = 0; i < neighborhood.length; i++) {
            List<Owner> owners1 = new ArrayList<Owner>();
            for (int j = 0; j < owners.size(); j++) {
                if (neighborhood[i].equals(owners.get(j).getNeighborhood())){
                    owners1.add(owners.get(j));
                }
            }

            totalOwners.add(new TotalOwners("total duenios por localidad " + neighborhood[i] + " es de " +(owners1.size()), owners1));
        }

        return Response.ok()
                .entity(totalOwners)
                .build();
    }
}
