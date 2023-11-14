package com.example.kboservice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Kbo {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "player_num", length = 30)
    private String playerNum;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "position", length = 50)
    private String position;

    @Column(name = "team_name", length = 50)
    private String teamName;

    @Column(name = "birthday", length = 30)
    private String birthday;

    @Column(name = "career", length = 255)
    private String career;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;
}
