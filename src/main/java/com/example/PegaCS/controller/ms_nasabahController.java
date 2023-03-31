package com.example.PegaCS.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PegaCS.model.ms_nasabah;
import com.example.PegaCS.repository.ms_nasabahRepository;

@RestController
class ms_nasabahController {
    private ms_nasabahRepository nasabahRepository;

    @GetMapping("/all")
    List<ms_nasabah> all() {
        return nasabahRepository.findAll();
    }

}