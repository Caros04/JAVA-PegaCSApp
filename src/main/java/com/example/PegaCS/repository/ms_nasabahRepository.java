package com.example.PegaCS.repository;

import com.example.PegaCS.model.ms_nasabah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ms_nasabahRepository extends JpaRepository<ms_nasabah, Long> {
    @Query("SELECT n FROM MS_NASABAH n WHERE n.cif = :cif")
    ms_nasabah findByCif(@Param("cif") int cif);
}
