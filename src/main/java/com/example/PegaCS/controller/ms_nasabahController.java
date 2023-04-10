// package com.example.PegaCS.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.PegaCS.model.ms_nasabah;
// import com.example.PegaCS.repository.ms_nasabahRepository;
// import com.example.PegaCS.service.ms_nasabahService;

// @RestController
// @RequestMapping("/nasabah")
// class ms_nasabahController {
// @Autowired
// private ms_nasabahService nasabahService;

// @GetMapping("/{CIF}")
// public ms_nasabah all(@PathVariable("CIF") int CIF) {
// return nasabahService.getNasabahById(CIF);
// }

// }