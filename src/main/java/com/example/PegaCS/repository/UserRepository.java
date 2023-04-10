package com.example.PegaCS.repository;

import com.example.PegaCS.model.user;

import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {

    @Transactional
    @Query(value = "SELECT * FROM \"USER\"", nativeQuery = true)
    List<user> findAllActiveUser();
}
