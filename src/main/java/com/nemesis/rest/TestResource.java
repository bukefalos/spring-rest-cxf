package com.nemesis.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Mac on 23/10/14.
 */
@Path("/test")
@Produces("application/json")
public interface TestResource {

    @GET
    @Path("/resource")
    Response getResource();

}
