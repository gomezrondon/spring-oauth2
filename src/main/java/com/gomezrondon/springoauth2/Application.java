package com.gomezrondon.springoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	public String getCredentials(Principal principal) {
		return "hola " + principal.getName() + " Welcome!";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
