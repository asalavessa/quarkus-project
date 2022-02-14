package pt.softinsa.com.testequarkus.resource;

import pt.softinsa.com.testequarkus.model.CreditRequest;
import pt.softinsa.com.testequarkus.model.CreditResponse;
import pt.softinsa.com.testequarkus.service.CreditService;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

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

    @GET
    @Path("/listrequests")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listRequests(){

        //CAST para creditResponse
        //List<CreditRequest> resultado =  em.createNativeQuery("SELECT * FROM public.creditrequest", CreditRequest.class).getResultList();

        List<CreditRequest> resultado =  em.createQuery("SELECT c FROM CreditRequest c", CreditRequest.class).getResultList();

        return Response.ok(resultado).build();

    }


    @GET
    @Path("/listresponses")
    @Produces(MediaType.APPLICATION_JSON)
    public List listResponses(){


        return em.createNativeQuery("SELECT * FROM public.creditresponse").getResultList();

    }

}
