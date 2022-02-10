package pt.softinsa.com.testequarkus.resource;

import pt.softinsa.com.testequarkus.model.CreditRequest;
import pt.softinsa.com.testequarkus.model.CreditResponse;
import pt.softinsa.com.testequarkus.service.CreditService;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Transactional
@Path("/credit")
public class CreditResource {


    @Inject
    CreditService creditService;

    @Inject
    private EntityManager em;

    @POST
    @Path("/request")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response requestCredit(CreditRequest creditRequest){

        CreditResponse  creditResponse = creditService.validateRentRequest(creditRequest);

        em.persist(creditRequest);
        em.persist(creditResponse);

        return Response.ok(creditResponse).build();





    }

}
