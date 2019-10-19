package com.pos.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.dao.model.Stock;

public interface IStockRepository extends JpaRepository<Stock, Long> {

}
