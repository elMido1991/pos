package com.pos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pos.dao.model.dto.ClientDto;

public interface IClientController {
	ResponseEntity<String> addClient(@RequestBody ClientDto clientdto) throws Exception ;
	ResponseEntity<String> updateClient(@PathVariable long id,@RequestBody ClientDto clientdto) throws Exception;
	@ResponseBody List<ClientDto> getAllClients() throws Exception ;
	@ResponseBody ClientDto getClient(@PathVariable long id) throws Exception ;
	@ResponseBody List<ClientDto> getClientsByPagination(@PathVariable int start,@PathVariable int end) throws Exception ;
	@ResponseBody List<ClientDto> getClientsByPaginationAndSort(@PathVariable int start,@PathVariable int end, @PathVariable String sortby, @PathVariable String asc) throws Exception ;
}
