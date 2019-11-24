package com.pos.dao.model.mappers.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.pos.dao.model.Stock;
import com.pos.dao.model.dto.StockDto;
import com.pos.dao.model.mappers.IStockMapper;


@Service
public class StockMapper implements IStockMapper {

	@Override
	public Stock mapToEntity(StockDto stockDto) {
		Stock stock = new Stock();
		BeanUtils.copyProperties(stockDto, stock);
		return stock;
	}

	@Override
	public StockDto mapToDto(Stock stock) {
		StockDto stockDto = new StockDto();
		BeanUtils.copyProperties(stock,stockDto );
		return stockDto;
	}

}
