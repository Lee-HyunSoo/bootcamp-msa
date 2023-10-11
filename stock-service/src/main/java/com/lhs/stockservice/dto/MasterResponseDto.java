package com.lhs.stockservice.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
public class MasterResponseDto {

    private Date date;
    private Integer open;
    private Integer high;
    private Integer low;
    private Integer close;
    private Integer stBefore;
    private Long volume;
    private Long stMoney;

    private String isuAbbrv; // 종목명
    private String mktTpNm; // 종류

    public MasterResponseDto(Date date, Integer open, Integer high, Integer low, Integer close, Integer stBefore, Long volume, Long stMoney, String isuAbbrv, String mktTpNm) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.stBefore = stBefore;
        this.volume = volume;
        this.stMoney = stMoney;
        this.isuAbbrv = isuAbbrv;
        this.mktTpNm = mktTpNm;
    }
}
