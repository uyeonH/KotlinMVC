package com.study.kotlinmvc.controller

import com.study.kotlinmvc.entity.Stock
import com.study.kotlinmvc.repository.StockRepository
import com.study.kotlinmvc.service.StockQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(private val stockService: StockQueryService){

    @GetMapping("/stocks")
    fun getStocks(): List<Stock> {
        return stockService.getStocks()
    }
}

