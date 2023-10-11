package com.lhs.stockservice.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class MasterView {
    @Id
    @Column(name = "INDEX")
    private String index;

    @Column(name = "ISU_NM")
    private String ISU_NM;

    @Column(name = "MKT_TP_NM")
    private String MKT_TP_NM;

    @Column(name = "ISU_SRT_CD")
    private String ISU_SRT_CD;
}
