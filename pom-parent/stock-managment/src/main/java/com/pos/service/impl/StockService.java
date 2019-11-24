package com.pos.service.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.pos.dao.model.Stock;
import com.pos.dao.model.dto.StockDto;
import com.pos.dao.model.mappers.IStockMapper;
import com.pos.dao.repository.IStockRepository;
import com.pos.service.IStockService;

@Service
public class StockService implements IStockService {
	
	@Autowired
	private IStockRepository iStockRepository;
	@Autowired
	private IStockMapper iStockMapper;
	@Autowired
	private EntityManager em;
	
	
	@Override
	public StockDto addQuantityToStock(StockDto stockDto) {
		Stock stock = iStockMapper.mapToEntity(stockDto);
		return iStockMapper.mapToDto(iStockRepository.save(stock));
	}
	@Override
	public StockDto updateQuantityOfStock(StockDto stockDto, double quantity) {
		stockDto.setQuantity(stockDto.getQuantity()+quantity);
		Stock stock = iStockMapper.mapToEntity(stockDto);
		return iStockMapper.mapToDto(iStockRepository.save(stock));
	}
	@Override
	public StockDto removeQuantityFromStock(StockDto stockDto, double quantity) {
		if(stockDto.getQuantity()<quantity){
			throw new RuntimeException("Stock not available !!!");
		}
		stockDto.setQuantity(stockDto.getQuantity()-quantity);
		Stock stock = iStockMapper.mapToEntity(stockDto);
		return iStockMapper.mapToDto(iStockRepository.save(stock));
	}
	@Override
	public StockDto getStockOfArticle(long idArticle, long idEntrepot) {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
	     CriteriaQuery<Stock> cq = cb.createQuery(Stock.class);
	 
	     Root<Stock> stock = cq.from(Stock.class);
	     Predicate authorNamePredicate = cb.equal(stock.get("articleid"), idArticle);
	     Predicate titlePredicate = cb.like(stock.get("STO_ENTREPOT_ID"), "%" + idEntrepot + "%");
	     cq.where(authorNamePredicate, titlePredicate);
	 
	     TypedQuery<Stock> query = em.createQuery(cq);
	     if(CollectionUtils.isEmpty(query.getResultList()))
	    	 throw new RuntimeException("Article may be not available !!!");
	     return iStockMapper.mapToDto(query.getResultList().get(0));
	}
	@Override
	public Set<StockDto> getStockOfArticles(Map<Long, Long> listStocks) {
		Set<StockDto> stockDtos = new HashSet<>();
		listStocks.forEach((idArticle,idEntrepot) -> stockDtos.add(getStockOfArticle(idArticle, idEntrepot)));
		return stockDtos;
	}
	
	
	
	
	

}
