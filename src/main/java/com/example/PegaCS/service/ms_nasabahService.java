package com.example.PegaCS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PegaCS.model.ms_nasabah;
import com.example.PegaCS.repository.ms_nasabahRepository;

@Service
public class ms_nasabahService {
    @Autowired
    ms_nasabahRepository nasabahRepo;

    public ms_nasabah getNasabahById(int CIF) {
        return nasabahRepo.findByCif(CIF);
    }
}
