package resources;

import resources.pojos.Case;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/cases/{parametro}")
public class CaseTotalReource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("parametro") String parametro) {

        List<Case> cases = new ArrayList<Case>();
        List<Case> cases1 = new ArrayList<Case>();
        Integer total = 0;

        cases.add(new Case(1,"Created", "PERDIDA", "Es negra con manchas blancas", 1));
        cases.add(new Case(1,"Created", "ROBO", "Es negra con manchas blancas", 1));
        cases.add(new Case(1,"Created", "ROBO", "Es negra con manchas blancas", 1));

        for (int i = 0; i < cases.size(); i++) {
            if(parametro.equals(cases.get(i).getType())){
                cases1.add(cases.get(i));
            }
        }
        total = cases1.size();
        return Response.ok()
                .entity(total)
                .build();
    }
}
