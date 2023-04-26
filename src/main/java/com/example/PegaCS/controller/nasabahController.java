package com.example.PegaCS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PegaCS.model.nasabah;
import com.example.PegaCS.model.user;
import com.example.PegaCS.repository.NasabahRepository;

@RestController
@RequestMapping(value = "/api")
public class nasabahController {

    private final NasabahRepository nasabahRepository;

    public nasabahController(NasabahRepository nasabahRepository) {
        this.nasabahRepository = nasabahRepository;
    }

    @GetMapping("/greeting")
    public List<nasabah> getNasabah() {
        return nasabahRepository.findAlltoTen();
    }

}