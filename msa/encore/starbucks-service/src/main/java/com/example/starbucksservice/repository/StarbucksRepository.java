package com.example.starbucksservice.repository;

import com.example.starbucksservice.model.Starbucks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarbucksRepository extends JpaRepository<Starbucks, Integer> {

    List<Starbucks> findByAddrContains(String addr);
}
