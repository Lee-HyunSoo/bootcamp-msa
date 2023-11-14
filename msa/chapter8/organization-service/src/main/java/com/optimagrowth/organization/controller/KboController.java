package com.optimagrowth.organization.controller;

import com.optimagrowth.organization.dto.KboDto;
import com.optimagrowth.organization.service.KboService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/kbo")
public class KboController {

    private final KboService kboService;

    @GetMapping("/players/{teamName}")
    public ResponseEntity<?> getPlayers(@PathVariable String teamName) {
        List<KboDto> result = kboService.findByTeamName(teamName);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
