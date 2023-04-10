package com.example.PegaCS;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.PegaCS")
public class PegaCsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegaCsApplication.class, args);
	}

}
