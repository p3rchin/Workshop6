package resources;

import resources.pojos.Case;
import resources.pojos.Owner;
import resources.pojos.TotalCases;
import resources.pojos.TotalOwners;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/cases")
public class CaseTotalReource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Case> cases = new ArrayList<Case>();
        List<TotalCases> totalCase = new ArrayList<TotalCases>();

        String[] casos = {"PERDIDA", "ROBO", "FALLECIMIENTO"};
        Integer total = 0;

        cases.add(new Case(1,"Created", "PERDIDA", "Es negra con manchas blancas", 1));
        cases.add(new Case(1,"Created", "ROBO", "Es negra con manchas blancas", 1));
        cases.add(new Case(1,"Created", "ROBO", "Es negra con manchas blancas", 1));

        for (int i = 0; i < casos.length; i++) {
            List<Case> cases1 = new ArrayList<Case>();
            for (int j = 0; j < cases.size(); j++) {
                if (casos[i].equals(cases.get(j).getType())){
                    cases1.add(cases.get(j));
                }
            }

            totalCase.add(new TotalCases("total de casos registrados por " + casos[i] + " es de " +(cases1.size()), cases1));
            }

        return Response.ok()
                .entity(totalCase)
                .build();
    }
}
