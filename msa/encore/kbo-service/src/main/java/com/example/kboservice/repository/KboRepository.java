package com.example.kboservice.repository;

import com.example.kboservice.model.Kbo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KboRepository extends JpaRepository<Kbo, Long> {

    List<Kbo> findByTeamName(String teamName);
}
