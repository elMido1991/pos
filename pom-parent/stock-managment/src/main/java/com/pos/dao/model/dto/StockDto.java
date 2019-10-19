package com.pos.dao.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
	private EntrepotDto entrepot;
	private long articleid;
	private double quantity;
}
