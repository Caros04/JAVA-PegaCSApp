package com.example.PegaCS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.PegaCS.model.ms_nasabah;
import com.example.PegaCS.repository.ms_nasabahRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.PegaCS.*")
@EntityScan("com.example.PegaCS.*")
@EnableJpaRepositories(basePackages = "com.example.PegaCS.repository")
// (scanBasePackages = {
// "com.example.PegaCS" })
// @EnableJpaRepositories(basePackageClasses = ms_nasabahRepository.class)
public class PegaCsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegaCsApplication.class, args);
	}

}
