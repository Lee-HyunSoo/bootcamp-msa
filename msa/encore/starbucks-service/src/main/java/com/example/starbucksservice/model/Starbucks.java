package com.example.starbucksservice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Starbucks {

    @Id
    @GeneratedValue
    private Integer id;

    private String sName;
    private String addr;
    private String openDt;
}
