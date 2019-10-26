package com.pos.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.pos.dao.model.Entrepot;
import com.pos.dao.model.dto.EntrepotDto;
import com.pos.dao.model.mappers.IEntrepotMapper;
import com.pos.dao.repository.IEntrepotRepository;
import com.pos.service.IEntrepotService;

public class EntrepotService implements IEntrepotService{

	@Autowired
	private IEntrepotRepository iEntrepotRepository;
	
	@Autowired
	private IEntrepotMapper iEntrepotMapper;
	
	
	@Override
	public EntrepotDto addEntrepot(EntrepotDto entrepotDto) {
		return iEntrepotMapper.mapToDto(iEntrepotRepository.save(iEntrepotMapper.mapToEntity(entrepotDto)));
	}

	@Override
	public EntrepotDto updateEntrepot(long idEntrepot, EntrepotDto entrepotDto) {
		// TODO Auto-generated method stub
		entrepotDto.setId(idEntrepot);
		return iEntrepotMapper.mapToDto(iEntrepotRepository.save(iEntrepotMapper.mapToEntity(entrepotDto)));
	}

	@Override
	public void deleteEntrepot(long idEntrepot) {
		iEntrepotRepository.deleteById(idEntrepot);
	}

	@Override
	public EntrepotDto getEntrepot(long idEntrepot) {
		return iEntrepotMapper.mapToDto(iEntrepotRepository.getOne(idEntrepot));
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<EntrepotDto> getEntrepots(Long... idEntrepot) {
		Set<EntrepotDto> entrepotsDtos = Collections.emptySet();
		Set<Entrepot> entrepots = Collections.emptySet();
		entrepots = (Set<Entrepot>) iEntrepotRepository.findAllById(Arrays.asList(idEntrepot));
		entrepots.forEach(x-> entrepotsDtos.add(iEntrepotMapper.mapToDto(x)));
		return entrepotsDtos;
	}

}
