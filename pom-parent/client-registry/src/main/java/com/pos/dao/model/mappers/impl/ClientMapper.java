package com.pos.dao.model.mappers.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.pos.dao.model.Client;
import com.pos.dao.model.dto.ClientDto;
import com.pos.dao.model.mappers.IClientMapper;

@Component
public class ClientMapper implements IClientMapper {
	
	
	public Client mapToEntity(ClientDto clientdto) throws Exception {
		Client client = new Client();
		BeanUtils.copyProperties(clientdto, client);
		return client;
	}
	
	
	public ClientDto mapToDto(Client client) throws Exception{
		ClientDto clientdto = new ClientDto();
		BeanUtils.copyProperties(client, clientdto);
		return clientdto;
	}
	
	

}
