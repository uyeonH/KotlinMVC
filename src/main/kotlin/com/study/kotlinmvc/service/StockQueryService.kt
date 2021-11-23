package com.study.kotlinmvc.service

import com.study.kotlinmvc.model.Stock
import com.study.kotlinmvc.repository.StockRepository
import org.springframework.stereotype.Service

@Service
class StockQueryService(private val stockRepository: StockRepository) {
    fun getStocks(): List<Stock> {
        return stockRepository.findAllAsModel()
    }
}

