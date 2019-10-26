package com.pos.controller.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.pos.controller.IEntrepotController;
import com.pos.dao.model.dto.EntrepotDto;
import com.pos.dao.model.dto.LocalisationDto;
import com.pos.dao.model.dto.StockDto;
import com.pos.service.IEntrepotService;
import com.pos.service.ILocalisationService;
import com.pos.service.IStockService;

public class EntrepotController implements IEntrepotController {
	
	@Autowired
	private IEntrepotService iEntrepotService;
	@Autowired
	private ILocalisationService iLocalisationService;
	@Autowired
	private IStockService iStockService;

	@Override
	public EntrepotDto addEntrepot(EntrepotDto entrepotDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntrepotDto updateEntrepot(long idEntrepot, EntrepotDto entrepotDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntrepot(long idEntrepot) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntrepotDto getEntrepot(long idEntrepot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<EntrepotDto> getEntrepots(Long... idEntrepot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockDto addQuantityToStock(StockDto stockDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockDto updateQuantityOfStock(StockDto stockDto, double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockDto removeQuantityFromStock(StockDto stockDto, double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockDto getStockOfArticle(long idArticle, long idEntrepot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<StockDto> getStockOfArticles(Map<Long, Long> listStocks) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalisationDto addLocalisation(LocalisationDto LocalisationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalisationDto updateLocalisation(long idLocalisation, LocalisationDto LocalisationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLocalisation(long idLocalisation) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalisationDto getLocalisation(long idLocalisation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<LocalisationDto> getLocalisations(Long... idLocalisation) {
		// TODO Auto-generated method stub
		return null;
	}

}
