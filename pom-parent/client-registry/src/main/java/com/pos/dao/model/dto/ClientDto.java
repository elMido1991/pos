package com.pos.dao.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String label;
	private String phoneNumber;
	private String adress;
	
	
}
