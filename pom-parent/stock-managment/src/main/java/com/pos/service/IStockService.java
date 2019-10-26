package com.pos.service;

import java.util.Map;
import java.util.Set;

import com.pos.dao.model.dto.StockDto;

public interface IStockService {
	StockDto addQuantityToStock(StockDto stockDto);
	StockDto updateQuantityOfStock(StockDto stockDto, double quantity);
	StockDto removeQuantityFromStock(StockDto stockDto, double quantity);
	StockDto getStockOfArticle(long idArticle, long idEntrepot);
	Set<StockDto> getStockOfArticles(Map<Long, Long> listStocks);
}
