package com.lhs.stockservice.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Entity
public class Master {

    @Id
    @GeneratedValue
    @Column(name = "index")
    private Long id;

    private String isuCd;
    private String isuSrtCd;
    private String isuNm;
    private String isuAbbrv;
    private String isuEngNm;
    private String listDd;
    private String mktTpNm;
    private String secugrpNm;
    private String sectTpNm;
    private String kindStkcertTpNm;
    private String parval;
    private String listShrs;
}
