package com.pos.dao.model.dto;

import com.pos.dao.model.Localisation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntrepotDto {
	private long id;
	private String libelle;
	private Localisation localisation;

}
