package com.example.starbucksservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StarbucksResponseDto {

    private String sName;
    private String addr;
    private String openDt;
}
