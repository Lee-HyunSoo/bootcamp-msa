package com.lhs.stockservice.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Entity
@IdClass(StockPk.class)
public class Stock {

    @Id
    private String stockCode;
    @Id
    private Date date;

    private Integer open;
    private Integer high;
    private Integer low;
    private Integer close;
    private Integer stBefore;
    private Long volume;
    private Long stMoney;
}
