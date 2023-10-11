package com.lhs.stockservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Builder
public class JoinDto {

    private String stockCode;
    private String ISU_NM;
    private String MKT_TP_NM;
    private Date date;
    private Integer open;
    private Integer high;
    private Integer low;
    private Integer close;
    private Long volume;

    public JoinDto(String stockCode, String ISU_NM, String MKT_TP_NM, Date date, Integer open, Integer high, Integer low, Integer close, Long volume) {
        this.stockCode = stockCode;
        this.ISU_NM = ISU_NM;
        this.MKT_TP_NM = MKT_TP_NM;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }
}
