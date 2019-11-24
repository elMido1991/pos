package com.pos.dao.model.mappers.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.pos.dao.model.Entrepot;
import com.pos.dao.model.dto.EntrepotDto;
import com.pos.dao.model.mappers.IEntrepotMapper;

@Service
public class EntrepotMapper implements IEntrepotMapper {

	@Override
	public Entrepot mapToEntity(EntrepotDto entrepotDto) {
		Entrepot entrepot = new Entrepot();
		BeanUtils.copyProperties(entrepotDto, entrepot);
		return entrepot;
	}

	@Override
	public EntrepotDto mapToDto(Entrepot entrepot) {
		EntrepotDto entrepotDto = new EntrepotDto();
		BeanUtils.copyProperties(entrepot, entrepotDto);
		return entrepotDto;
	}

}
