package helloworld;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/helloworld")
public class HelloWorld {
    @Context
    private UriInfo context;

    public HelloWorld() {
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<html><body><h1>Hello, World!!</body></h1></html>";
    }

    @GET
    @Path("/{username}")
    @Produces("text/html")
    public String getUser(@PathParam("username") String userName) {
        return "<html><body><h1>Hello " + userName + "!!</body></h1></html>";
    }

    @GET
    @Path("/query")
    @Produces("text/html")
    public String getUserWithQuery(@QueryParam("query") String userName) {
        return "<html><body><h1>Your Query: " + userName + "!!</body></h1></html>";
    }

    @GET
    @Path("/{cnum}/query")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCard(@PathParam("cnum") int cardNumber) {
        String s1 = "<html><body><h1>";
        String s2 = "</h1></body></html>";
        if (cardNumber == 123) {
            String message = "{num:123, nickname:'Alonzo' type:'Adult'}";
            return s1 + message + s2;
        } else {
            return s1 + "Would you like to apply for a library card?" + s2;
        }
    }

    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}