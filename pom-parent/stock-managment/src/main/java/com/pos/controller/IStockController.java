package com.pos.controller;

import java.util.Map;
import java.util.Set;

import com.pos.dao.model.dto.EntrepotDto;
import com.pos.dao.model.dto.LocalisationDto;
import com.pos.dao.model.dto.StockDto;

public interface IStockController {
	EntrepotDto addEntrepot(EntrepotDto entrepotDto);
	EntrepotDto updateEntrepot(long idEntrepot, EntrepotDto entrepotDto);
	void deleteEntrepot(long idEntrepot);
	EntrepotDto getEntrepot(long idEntrepot);
	Set<EntrepotDto> getEntrepots(Long ...idEntrepot);
	StockDto addQuantityToStock(StockDto stockDto);
	StockDto updateQuantityOfStock(StockDto stockDto, double quantity);
	StockDto removeQuantityFromStock(StockDto stockDto, double quantity);
	StockDto getStockOfArticle(long idArticle, long idEntrepot);
	Set<StockDto> getStockOfArticles(Map<Long, Long> listStocks);
	LocalisationDto addLocalisation(LocalisationDto LocalisationDto);
	LocalisationDto updateLocalisation(long idLocalisation, LocalisationDto LocalisationDto);
	void deleteLocalisation(long idLocalisation);
	LocalisationDto getLocalisation(long idLocalisation);
	Set<LocalisationDto> getLocalisations(Long ...idLocalisation);
}
