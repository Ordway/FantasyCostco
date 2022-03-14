package com.cognixia.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info( title = "FantasyCostco", version = "1.0", description = "API for D&D player inventory "))
public class FantasyCostcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasyCostcoApplication.class, args);
	}

}
