package resources;

import resources.pojos.Case;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets/{petId}/cases")
public class CasesResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("petId") Integer petId) {

        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(1,"Created", "PERDIDA", "Es negra con manchas blancas", petId));

        return Response.ok()
                .entity(cases)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("petId") Integer petId, Case casse) {

        casse.setCaseId(3);

        return Response.status(Response.Status.CREATED)
                .entity(casse)
                .build();
    }
}
