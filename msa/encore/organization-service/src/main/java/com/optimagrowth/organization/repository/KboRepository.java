package com.optimagrowth.organization.repository;

import com.optimagrowth.organization.model.Kbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KboRepository extends JpaRepository<Kbo, Long>  {
    List<Kbo> findByTeamName(String teamName);
}
