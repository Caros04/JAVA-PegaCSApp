package com.example.PegaCS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.PegaCS.model.ms_nasabah;
import com.example.PegaCS.repository.ms_nasabahRepository;

@SpringBootApplication
public class PegaCsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegaCsApplication.class, args);
	}

}
