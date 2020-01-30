package com.example.demoRestEx;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResourse {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getAlien() {
		System.out.println("GEt called");
		return "Aliens";
	}

}
