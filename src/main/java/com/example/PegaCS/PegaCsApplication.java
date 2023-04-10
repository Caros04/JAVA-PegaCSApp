package com.example.PegaCS;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PegaCS.model.user;
import com.example.PegaCS.repository.UserRepository;

// import com.example.PegaCS.model.ms_nasabah;
// import com.example.PegaCS.repository.ms_nasabahRepository;

@SpringBootApplication
@RestController
@RequestMapping("/api")
@ComponentScan("com.example.PegaCS")
// @ComponentScan({ "com.example.PegaCS.model", "com.example.PegaCS.repository",
// "com.example.PegaCS.controller",
// "com.example.PegaCS.service" })
// // @EntityScan("com.example.PegaCS.*")
// @EnableJpaRepositories(basePackages = "com.example.PegaCS.repository")
// (scanBasePackages = {
// "com.example.PegaCS" })
public class PegaCsApplication {

	private final UserRepository userRepository;

	public PegaCsApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PegaCsApplication.class, args);
	}

	@GetMapping("/greet")
	public List<user> getNasabah() {
		return userRepository.findAllActiveUser();
		// return userRepository.findAll();
	}

}
