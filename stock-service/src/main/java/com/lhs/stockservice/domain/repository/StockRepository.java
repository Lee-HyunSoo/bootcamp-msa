package com.lhs.stockservice.domain.repository;

import com.lhs.stockservice.domain.entity.StockPk;
import com.lhs.stockservice.domain.entity.Stock;
import com.lhs.stockservice.dto.JoinDto;
import com.lhs.stockservice.dto.MasterResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface StockRepository extends JpaRepository<Stock, StockPk> {

    @Query("select s from Stock s where s.stockCode = :stockCode and s.date between :startDate and :endDate")
    List<Stock> findByIdAndPeriod(@Param("stockCode") String stockCode,
                                  @Param("startDate") Date startDate,
                                  @Param("endDate") Date endDate);

    List<Stock> findStockDayTableByStockCodeAndDateBetween(String stockCode, Date startDate, Date endDate);


    @Query("select new com.lhs.stockservice.dto.MasterResponseDto(" +
            "s.date, s.open, s.high, s.low, s.close, s.stBefore, s.volume, s.stMoney, m.isuAbbrv, m.mktTpNm) " +
            "from Stock s, Master m " +
            "where s.stockCode = :stockCode and m.isuSrtCd = :isuSrtCd and s.date between :startDate and :endDate")
    List<MasterResponseDto> findMasterByIdAndDate(@Param("stockCode") String stockCode,
                                                  @Param("isuSrtCd") String isuSrtCd,
                                                  @Param("startDate") Date startDate,
                                                  @Param("endDate") Date endDate);
    @Query("select new com.lhs.stockservice.dto.JoinDto(" +
            "t.stockCode, r.ISU_NM, r.MKT_TP_NM, t.date, t.open, t.high, t.low, t.close, t.volume) " +
            "from Stock t left join MasterView r on t.stockCode = r.ISU_SRT_CD " +
            "where t.stockCode = :stockCode")
    List<JoinDto> queryByStockCodeWithMaster(@Param("stockCode") String stockCode);
}
