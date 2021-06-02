package resources;

import resources.pojos.Owner;
import resources.pojos.TotalOwners;
import resources.pojos.TotalVisits;
import resources.pojos.Visit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/visit")
public class VisitsTotalResource {

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Response list() {

            List<Visit> visits = new ArrayList<Visit>();
            List<TotalVisits> totalVisits = new ArrayList<TotalVisits>();

            String[] tipo = {"ESTERILIZACION", "IMPLANTACION DE MICROCHIP", "VACUNACION", "DESPARASITACION", "URGENCIA", "CONTROL"};
            Integer total = 0;

            visits.add(new Visit(1, "hola", "VACUNACION", "El perro está vomitado", 1, 1));

            for (int i = 0; i < tipo.length; i++) {
                List<Visit> visits1 = new ArrayList<Visit>();
                for (int j = 0; j < visits.size(); j++) {
                    if (tipo[i].equals(visits.get(j).getType())){
                        visits1.add(visits.get(j));
                    }
                }

                totalVisits.add(new TotalVisits("total visitas por " + tipo[i] + " es de " +(visits1.size()), visits1));
            }

            return Response.ok()
                    .entity(totalVisits)
                    .build();
        }
    }

