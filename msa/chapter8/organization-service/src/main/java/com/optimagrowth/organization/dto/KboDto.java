package com.optimagrowth.organization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KboDto {

    private String playerNum;
    private String name;
    private String position;
    private String teamName;
    private String birthday;
    private String career;
    private Integer height;
    private Integer weight;
}
