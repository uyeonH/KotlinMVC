package com.study.kotlinmvc.repository

import com.study.kotlinmvc.dto.StockEntity
import com.study.kotlinmvc.model.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : JpaRepository<StockEntity, String> {
    fun findAllAsModel(): List<Stock> {
        return this.findAll().map { it.toModel() }
    }

}

