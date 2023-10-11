package com.lhs.stockservice.service;

import com.lhs.stockservice.domain.entity.Stock;
import com.lhs.stockservice.domain.repository.StockRepository;
import com.lhs.stockservice.dto.JoinDto;
import com.lhs.stockservice.dto.MasterResponseDto;
import com.lhs.stockservice.dto.StockResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    @Override
    public List<StockResponseDto> findByIdAndDate(String stockCode, Date startDate, Date endDate) {
        List<Stock> stocks = stockRepository
                .findStockDayTableByStockCodeAndDateBetween(stockCode, startDate, endDate);
        log.info("[StockServiceImpl findByIdAndDate] findStockData: {}", stocks);

        return stocks.stream()
                .map(s -> new StockResponseDto(s.getDate(), s.getOpen(), s.getHigh(), s.getLow(),
                        s.getClose(), s.getStBefore(), s.getVolume(), s.getStMoney()))
                .collect(Collectors.toList());
    }

    @Override
    public List<MasterResponseDto> findMasterByIdAndDate(String stockCode, Date startDate, Date endDate) {
        String isuSrtCode = stockCode.substring(1);
        log.info("[StockServiceImpl findMasterByIdAndDate] isuSrtCode: {}", isuSrtCode);

        return stockRepository.findMasterByIdAndDate(stockCode, isuSrtCode, startDate, endDate);
    }

    @Override
    public List<JoinDto> getStockByJoinDtos(String stockCode) {
        List<JoinDto> stocks = stockRepository.queryByStockCodeWithMaster(stockCode);
        return stocks;
    }
}
