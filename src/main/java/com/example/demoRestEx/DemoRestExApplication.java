package com.example.demoRestEx;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Path("aliens")
public class DemoRestExApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context	=SpringApplication.run(DemoRestExApplication.class, args);
	
	   //Need object of Alien class
		Alien alien=context.getBean(Alien.class);
		alien.show();
		Alien alien2=context.getBean(Alien.class);
		
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello dd";
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getAlien() {
		System.out.println("GEt called");
		return "Aliens";
	}

}
