package com.example.starbucksservice.controller;

import com.example.starbucksservice.dto.StarbucksRequestDto;
import com.example.starbucksservice.dto.StarbucksResponseDto;
import com.example.starbucksservice.service.StarbucksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/starbucks")
@RestController
public class StarbucksController {

    private final StarbucksService starbucksService;

    @PostMapping("/list")
    public ResponseEntity<List<StarbucksResponseDto>> getListByAddr(
            @RequestBody StarbucksRequestDto starbucksRequestDto) {

        List<StarbucksResponseDto> result = starbucksService.getListByAddr(starbucksRequestDto.getAddr());
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
