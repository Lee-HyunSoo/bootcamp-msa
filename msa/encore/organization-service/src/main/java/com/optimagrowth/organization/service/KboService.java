package com.optimagrowth.organization.service;

import com.optimagrowth.organization.dto.KboDto;
import com.optimagrowth.organization.model.Kbo;
import com.optimagrowth.organization.repository.KboRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class KboService {
	
    private final KboRepository kboRepository;

    public List<KboDto> findByTeamName(String teamName) {
        List<Kbo> players = kboRepository.findByTeamName(teamName);

        return players.stream().map(v -> new KboDto(
                v.getPlayerNum(), v.getName(), v.getPosition(),
                v.getTeamName(), v.getBirthday(), v.getCareer(),
                v.getHeight(), v.getWeight())).collect(Collectors.toList());
    }
}