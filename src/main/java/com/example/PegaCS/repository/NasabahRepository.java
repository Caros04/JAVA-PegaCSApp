package com.example.PegaCS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.PegaCS.model.nasabah;
import jakarta.transaction.Transactional;

@Repository
public interface NasabahRepository extends JpaRepository<nasabah, Long> {
    @Transactional
    @Query(value = "SELECT * FROM MS_NASABAH mn  WHERE ROWNUM <= 10", nativeQuery = true)
    List<nasabah> findAlltoTen();
}
