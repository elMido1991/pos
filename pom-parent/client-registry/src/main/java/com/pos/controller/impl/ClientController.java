package com.pos.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pos.controller.IClientController;
import com.pos.dao.model.dto.ClientDto;
import com.pos.service.impl.ClientService;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/clients")
@Controller
public class ClientController implements IClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping(value= "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "add client")
	public ResponseEntity<String> addClient(@RequestBody ClientDto clientdto) throws Exception {
		if(Optional.ofNullable(clientService.addOrUpdateClient(clientdto)).isPresent())
			return ResponseEntity.ok().body("Client created");
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Client not created");
	}
	
	
	@PutMapping(value= "/update/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "update client")
	public ResponseEntity<String> updateClient(@PathVariable long id,@RequestBody ClientDto clientdto) throws Exception {
		clientdto.setId(id);
		if(Optional.ofNullable(clientService.addOrUpdateClient(clientdto)).isPresent())
			return ResponseEntity.ok().body("Client updated");
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Client not updated");
	}
	
	
	@GetMapping(value= "/all",produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get all clients")
	public @ResponseBody List<ClientDto> getAllClients() throws Exception {
		return clientService.getAllClients();
	}
	
	@GetMapping(value= "/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get one client")
	public @ResponseBody ClientDto getClient(@PathVariable long id) throws Exception {
		return clientService.getClient(id);
	}
	
	@GetMapping(value= "/find/{start}/{end}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get clients by pagination")
	public @ResponseBody List<ClientDto> getClientsByPagination(@PathVariable int start,@PathVariable int end) throws Exception {
		return clientService.getAllClientsByPagination(start, end);
	}
	
	@GetMapping(value= "/find/{start}/{end}/{sortby}/{asc}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "get clients by pagination with sorting")
	public @ResponseBody List<ClientDto> getClientsByPaginationAndSort(@PathVariable int start,@PathVariable int end, @PathVariable String sortby, @PathVariable String asc) throws Exception {
		return clientService.getAllClientsByPaginationAndSorting(start, end,sortby,asc);
	}
	
	
}
