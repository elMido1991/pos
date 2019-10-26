package com.pos.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.pos.dao.model.Localisation;
import com.pos.dao.model.dto.LocalisationDto;
import com.pos.dao.model.mappers.ILocalisationMapper;
import com.pos.dao.repository.ILocalisationRepository;
import com.pos.service.ILocalisationService;

public class LocalisationService implements ILocalisationService{

	@Autowired
	private ILocalisationRepository iLocalisationRepository;
	
	@Autowired
	private ILocalisationMapper iLocalisationMapper;
	
	
	@Override
	public LocalisationDto addLocalisation(LocalisationDto LocalisationDto) {
		return iLocalisationMapper.mapToDto(iLocalisationRepository.save(iLocalisationMapper.mapToEntity(LocalisationDto)));
	}

	@Override
	public LocalisationDto updateLocalisation(long idLocalisation, LocalisationDto LocalisationDto) {
		// TODO Auto-generated method stub
		LocalisationDto.setId(idLocalisation);
		return iLocalisationMapper.mapToDto(iLocalisationRepository.save(iLocalisationMapper.mapToEntity(LocalisationDto)));
	}

	@Override
	public void deleteLocalisation(long idLocalisation) {
		iLocalisationRepository.deleteById(idLocalisation);
	}

	@Override
	public LocalisationDto getLocalisation(long idLocalisation) {
		return iLocalisationMapper.mapToDto(iLocalisationRepository.getOne(idLocalisation));
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<LocalisationDto> getLocalisations(Long... idLocalisation) {
		Set<LocalisationDto> LocalisationsDtos = Collections.emptySet();
		Set<Localisation> Localisations = Collections.emptySet();
		Localisations = (Set<Localisation>) iLocalisationRepository.findAllById(Arrays.asList(idLocalisation));
		Localisations.forEach(x-> LocalisationsDtos.add(iLocalisationMapper.mapToDto(x)));
		return LocalisationsDtos;
	}


}
