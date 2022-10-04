package com.cats.cats;

// import SpringApplication from "SpringApplication"
import org.springframework.boot.SpringApplication;

// import SpringBootApplication from "SpringBootApplication"
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation / decorator
@SpringBootApplication
public class CatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsApplication.class, args);
	}

}
