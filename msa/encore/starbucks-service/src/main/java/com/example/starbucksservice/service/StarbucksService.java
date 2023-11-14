package com.example.starbucksservice.service;

import com.example.starbucksservice.dto.StarbucksResponseDto;
import com.example.starbucksservice.model.Starbucks;
import com.example.starbucksservice.repository.StarbucksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class StarbucksService {

    private final StarbucksRepository starbucksRepository;

    public List<StarbucksResponseDto> getListByAddr(String addr) {
        List<Starbucks> starbucks = starbucksRepository.findByAddrContains(addr);
        return starbucks.stream()
                .map(v -> new StarbucksResponseDto(v.getSName(), v.getAddr(), v.getOpenDt()))
                .collect(Collectors.toList());
    }
}
