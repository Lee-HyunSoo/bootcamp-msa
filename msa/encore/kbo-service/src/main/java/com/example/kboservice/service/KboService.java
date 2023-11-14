package com.example.kboservice.service;

import com.example.kboservice.model.Kbo;
import com.example.kboservice.repository.KboRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class KboService {

    private final KboRepository kboRepository;

    public List<Kbo> findByTeamName(String team){
        List<Kbo> teams = kboRepository.findByTeamName(team);
        return teams;
    }
}
