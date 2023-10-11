package com.lhs.stockservice.service;

import com.lhs.stockservice.dto.JoinDto;
import com.lhs.stockservice.dto.MasterResponseDto;
import com.lhs.stockservice.dto.StockResponseDto;

import java.sql.Date;
import java.util.List;

public interface StockService {

    List<StockResponseDto> findByIdAndDate(String stockCode, Date startDate, Date endDate);
    List<MasterResponseDto> findMasterByIdAndDate(String stockCode, Date startDate, Date endDate);
    List<JoinDto> getStockByJoinDtos(String stockCode);
}
