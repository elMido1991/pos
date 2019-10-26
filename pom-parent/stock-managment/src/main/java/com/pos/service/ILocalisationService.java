package com.pos.service;

import java.util.Set;

import com.pos.dao.model.dto.LocalisationDto;

public interface ILocalisationService {
	LocalisationDto addLocalisation(LocalisationDto LocalisationDto);
	LocalisationDto updateLocalisation(long idLocalisation, LocalisationDto LocalisationDto);
	void deleteLocalisation(long idLocalisation);
	LocalisationDto getLocalisation(long idLocalisation);
	Set<LocalisationDto> getLocalisations(Long ...idLocalisation);
}
