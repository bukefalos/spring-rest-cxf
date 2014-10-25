package com.nemesis.rest;

import javax.ws.rs.core.Response;

/**
 * Created by Mac on 23/10/14.
 */
public class TestResourceImpl implements TestResource {


    @Override
    public Response getResource() {
         return Response.ok().entity(new SimpleRestAnswer().add("data", "there is no data")).build();
    }
}
