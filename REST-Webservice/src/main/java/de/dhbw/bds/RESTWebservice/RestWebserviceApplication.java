package de.dhbw.bds.RESTWebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebserviceApplication {

	public static void main(String[] args) {
		System.out.println("starting ...");
		SpringApplication.run(RestWebserviceApplication.class, args);
		System.out.println("stopping ...");
	}

}
