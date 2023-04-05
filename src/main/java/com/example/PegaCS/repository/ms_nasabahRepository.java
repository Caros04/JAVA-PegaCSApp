package com.example.PegaCS.repository;

import com.example.PegaCS.model.ms_nasabah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ms_nasabahRepository extends JpaRepository<ms_nasabah, Long> {

}
