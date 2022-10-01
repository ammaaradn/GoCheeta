/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ammaar
 */
@Path("admin")
public class AdminService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAdmins() {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(utils.getAdmins());
        
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAdmin( ) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(utils.getAdmin("1"));
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addAdmin(String json) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        Admin admin = gson.fromJson(json, Admin.class);
        boolean result = utils.addAdmin(admin);
        
        if (result) {
            return Response.status(201).entity("Successfully added").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAdmin(String json) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        Admin admin = gson.fromJson(json, Admin.class);
        boolean result = utils.updateAdmin(admin);
        
        if (result) {
            return Response.status(200).entity("Successfully updated").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
    
    @DELETE
    @Path("/{id}")
    public Response deleteAdmin(@PathParam("id") String id) {
        DBUtils utils = new DBUtils();
        boolean result = utils.deleteAdmin(id);
        if (result) {
            return Response.status(200).entity("Successfully deleted").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
}