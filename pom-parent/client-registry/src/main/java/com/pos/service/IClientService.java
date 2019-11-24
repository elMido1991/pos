package com.pos.service;

import java.util.List;

import com.pos.dao.model.dto.ClientDto;

public interface IClientService {
	 ClientDto addOrUpdateClient(ClientDto clientdto) throws Exception;
	 List<ClientDto> getAllClients() throws Exception;
	 List<ClientDto> getAllClientsByPagination(int start, int end) throws Exception;
	 List<ClientDto> getAllClientsByPaginationAndSorting(int start, int end, String sortby, String asc) throws Exception;
	 ClientDto getClient(long id) throws Exception;
}
