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
public class StockResponseDto {

    private Date date;
    private Integer open;
    private Integer high;
    private Integer low;
    private Integer close;
    private Integer stBefore;
    private Long volume;
    private Long stMoney;
}
