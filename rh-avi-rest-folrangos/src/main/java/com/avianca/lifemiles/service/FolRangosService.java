package com.avianca.lifemiles.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.avianca.lifemiles.model.response.FolRangoRow;

/**
 * 
 * @author Assert Solutions S.A.S
 *
 */
@Path("")
public interface FolRangosService {
    
    @GET
    @Consumes({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
    @Produces({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
    public List<FolRangoRow> getRangos();
}
