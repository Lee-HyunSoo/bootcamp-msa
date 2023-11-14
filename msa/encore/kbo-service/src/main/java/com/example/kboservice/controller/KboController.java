package com.example.kboservice.controller;

import com.example.kboservice.model.Kbo;
import com.example.kboservice.service.KboService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/kbo")
public class KboController {

    private static final Logger log = LoggerFactory.getLogger(KboController.class);
    private final KboService kboService;

    @GetMapping("/hi")
    public String getHello() {
        log.info("[KboController getHello()] method start");
        return "Hi";
    }

    @GetMapping("/team/{team}")
    public ResponseEntity<List<Kbo>> getKboTeam(@PathVariable String team) {
        log.info("[KboController getKboTeam] team : {}", team);
        List<Kbo> result = kboService.findByTeamName(team);
        return ResponseEntity.ok(result);
    }
}
