package com.offla.ws;

import javax.ejb.LocalBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@LocalBean
@Path("/identityprovider")
public class IdentityProviderWS {
	
	private static final String tenantId = "07ba396e-a2ed-4a18-88e6-26c5401c75c0";
	
	@Path("/"+ tenantId + "/ip/startAuthorization")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String startAuthorization(){
		return "";
		
	}
	
	
		
	

}
