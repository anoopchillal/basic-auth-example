package com.example.BasicAuthProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class BasicAuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthProjectApplication.class, args);
	}

}
