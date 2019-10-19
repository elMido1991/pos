package com.pos.dao.model.mappers;

import com.pos.dao.model.Localisation;
import com.pos.dao.model.dto.LocalisationDto;

public interface ILocalisationMapper {
	Localisation mapToEntity(LocalisationDto localisationDto);
	LocalisationDto mapToDto(Localisation localisation);
}
