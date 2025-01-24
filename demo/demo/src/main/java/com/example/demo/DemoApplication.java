package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	
	 public static void main(String[] args) {
	        String port = System.getenv("PORT");
	        if (port != null) {
	            System.setProperty("server.port", port);
	        } else {
	            System.setProperty("server.port", "3000");
	        }
	    	SpringApplication.run(DemoApplication.class, args);
	       // SpringApplication.run(SideProApplication.class, args);
	    }
	}

	@RestController
	class SideProController {
	    @GetMapping("/")
	    public String home() {
	        return "Hello, SidePro!";
	    }
	}


