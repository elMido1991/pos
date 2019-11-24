package com.pos.dao.model.mappers.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.pos.dao.model.Localisation;
import com.pos.dao.model.dto.LocalisationDto;
import com.pos.dao.model.mappers.ILocalisationMapper;


@Service
public class LocalisationMapper implements ILocalisationMapper {

	@Override
	public Localisation mapToEntity(LocalisationDto localisationDto) {
		Localisation localisation = new Localisation();
		BeanUtils.copyProperties(localisationDto, localisation);
		return localisation;
	}

	@Override
	public LocalisationDto mapToDto(Localisation localisation) {
		LocalisationDto localisationDto = new LocalisationDto();
		BeanUtils.copyProperties(localisation, localisationDto);
		return localisationDto;
	}

}
