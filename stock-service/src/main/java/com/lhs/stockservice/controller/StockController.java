package com.lhs.stockservice.controller;

import com.lhs.stockservice.dto.JoinDto;
import com.lhs.stockservice.dto.MasterResponseDto;
import com.lhs.stockservice.dto.StockResponseDto;
import com.lhs.stockservice.service.StockService;
import com.lhs.stockservice.service.StockServiceImpl;
import com.lhs.stockservice.dto.StockRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    @PostMapping
    public ResponseEntity<List<StockResponseDto>> findByIdAndDate(@RequestBody StockRequestDto stockRequestDto) {
        log.info("[StockController findByIdAndDate] stockRequestDto: {}", stockRequestDto);
        List<StockResponseDto> result = stockService.findByIdAndDate(
                stockRequestDto.getStockCode(), stockRequestDto.getStartDate(), stockRequestDto.getEndDate()
        );
        log.info("[StockController findByIdAndDate] result: {}", result);

        if (result.isEmpty())
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/master")
    public ResponseEntity<List<MasterResponseDto>> findMasterByIdAndDate(@RequestBody StockRequestDto stockRequestDto) {
        log.info("[StockController findMasterByIdAndDate] stockRequestDto: {}", stockRequestDto);
        List<MasterResponseDto> result = stockService.findMasterByIdAndDate(
                stockRequestDto.getStockCode(), stockRequestDto.getStartDate(), stockRequestDto.getEndDate()
        );
        log.info("[StockController findMasterByIdAndDate] result: {}", result);

        if (result.isEmpty())
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/join/{stockCode}")
    public ResponseEntity<List<JoinDto>> joinShow(@PathVariable String stockCode){
        List<JoinDto> stockDTOs = stockService.getStockByJoinDtos(stockCode);

        if (stockDTOs.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(stockDTOs);
    }
}



