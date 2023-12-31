package com.lhs.stockservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRequestDto {

    private String stockCode;
    private Date startDate;
    private Date endDate;
}
