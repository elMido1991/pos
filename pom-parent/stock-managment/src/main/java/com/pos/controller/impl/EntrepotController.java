package com.pos.controller.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pos.controller.IEntrepotController;
import com.pos.dao.model.dto.EntrepotDto;
import com.pos.dao.model.dto.LocalisationDto;
import com.pos.dao.model.dto.StockDto;
import com.pos.service.IEntrepotService;
import com.pos.service.ILocalisationService;
import com.pos.service.IStockService;

import io.swagger.annotations.ApiOperation;


@RequestMapping("/stock")
@Controller
public class EntrepotController implements IEntrepotController {
	
	@Autowired
	private IEntrepotService iEntrepotService;
	@Autowired
	private ILocalisationService iLocalisationService;
	@Autowired
	private IStockService iStockService;

	@Override
	@PostMapping(value= "/entrepot/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "add entrepot")
	public @ResponseBody EntrepotDto addEntrepot(@RequestBody EntrepotDto entrepotDto) {
		return iEntrepotService.addEntrepot(entrepotDto);
	}

	@Override
	@PutMapping(value= "/entrepot/update/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "update entrepot")
	public @ResponseBody EntrepotDto updateEntrepot(@PathVariable long idEntrepot, @RequestBody EntrepotDto entrepotDto) {
		// TODO Auto-generated method stub
		return iEntrepotService.updateEntrepot(idEntrepot, entrepotDto);
	}

	@Override
	@DeleteMapping(value= "/entrepot/delete/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "delete entrepot")
	public void deleteEntrepot(@PathVariable long idEntrepot) {
		iEntrepotService.deleteEntrepot(idEntrepot);

	}

	@Override
	@GetMapping(value= "/entrepot/get/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get entrepot")
	public @ResponseBody EntrepotDto getEntrepot(@PathVariable long idEntrepot) {
		return iEntrepotService.getEntrepot(idEntrepot);
	}

	@Override
	@GetMapping(value= "/entrepot/getall/{ids}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get all entrepots")
	public @ResponseBody Set<EntrepotDto> getEntrepots(@PathVariable Long... idEntrepots) {
		return iEntrepotService.getEntrepots(idEntrepots);
	}

	@Override
	@PostMapping(value= "/article/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "add article quantity")
	public @ResponseBody StockDto addQuantityToStock(@RequestBody StockDto stockDto) {
		return iStockService.addQuantityToStock(stockDto);
	}

	@Override
	@PutMapping(value= "/article/update/{quantity}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "update article quantity")
	public @ResponseBody StockDto updateQuantityOfStock(@RequestBody StockDto stockDto, @PathVariable double quantity) {
		return iStockService.updateQuantityOfStock(stockDto, quantity);
	}

	@Override
	@PutMapping(value= "/article/remove/{quantity}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "remove article quantity")
	public @ResponseBody StockDto removeQuantityFromStock(@RequestBody StockDto stockDto, @PathVariable double quantity) {
		// TODO Auto-generated method stub
		return iStockService.removeQuantityFromStock(stockDto, quantity);
	}

	@Override
	@GetMapping(value= "/article/get/{idArticle}/entrepot/get/{idEntrepot}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get stock of article in entrepot")
	public @ResponseBody StockDto getStockOfArticle(@PathVariable long idArticle, @PathVariable long idEntrepot) {
		// TODO Auto-generated method stub
		return iStockService.getStockOfArticle(idArticle, idEntrepot);
	}

	@Override
	@GetMapping(value= "/article/entrepot/get/",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get stock of article in entrepot")
	public Set<StockDto> getStockOfArticles(@RequestParam  Map<Long, Long> listStocks) {
		return iStockService.getStockOfArticles(listStocks);
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
