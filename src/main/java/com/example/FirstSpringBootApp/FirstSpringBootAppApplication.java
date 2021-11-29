package com.example.FirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringBootAppApplication.class, args);
	}
	@GetMapping
	public List<String> hello(){
		return List.of("Hello","world");
	}

}
