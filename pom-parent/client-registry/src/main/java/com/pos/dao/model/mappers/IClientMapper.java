package com.pos.dao.model.mappers;

import com.pos.dao.model.Client;
import com.pos.dao.model.dto.ClientDto;

public interface IClientMapper {
	Client mapToEntity(ClientDto clientdto) throws Exception;
	ClientDto mapToDto(Client client) throws Exception;
}
