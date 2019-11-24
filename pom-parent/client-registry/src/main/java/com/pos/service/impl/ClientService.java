package com.pos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pos.dao.model.Client;
import com.pos.dao.model.dto.ClientDto;
import com.pos.dao.model.mappers.impl.ClientMapper;
import com.pos.dao.repository.ClientRepository;
import com.pos.service.IClientService;

@Service
public class ClientService implements IClientService {

	@Autowired
	private ClientMapper clientMapper;
	
	@Autowired
	private ClientRepository clientRepository;
	
	public ClientDto addOrUpdateClient(ClientDto clientdto) throws Exception {
		Client client = clientMapper.mapToEntity(clientdto);
		client = clientRepository.save(client);
		clientdto = clientMapper.mapToDto(client);
		return clientdto;
	}


	public List<ClientDto> getAllClients() throws Exception {
		List<Client> clients = clientRepository.findAll();
		List<ClientDto> clientsdto = new ArrayList<>();
		clients.forEach(client -> {
			try {
				clientsdto.add(clientMapper.mapToDto(client));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} );
		return clientsdto;
	}
	
	
	public List<ClientDto> getAllClientsByPagination(int start, int end) throws Exception {
		Pageable clientpage = PageRequest.of(start, end);
		Page<Client> pageclients = clientRepository.findAll(clientpage);
		List<ClientDto> clientsdto = new ArrayList<>();
		pageclients.forEach(client -> {
			try {
				clientsdto.add(clientMapper.mapToDto(client));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} );
		return clientsdto;
	}
	
	public List<ClientDto> getAllClientsByPaginationAndSorting(int start, int end, String sortby, String asc) {
		Pageable clientpage = PageRequest.of(start, end,"asc".equals(asc)?Sort.by(sortby).ascending():Sort.by(sortby).descending());
		Page<Client> pageclients = clientRepository.findAll(clientpage);
		List<ClientDto> clientsdto = new ArrayList<>();
		pageclients.forEach(client -> {
			try {
				clientsdto.add(clientMapper.mapToDto(client));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} );
		return clientsdto;
	}


	public ClientDto getClient(long id) throws Exception {
		Optional<Client> optionalclient = clientRepository.findById(id);
		return optionalclient.isPresent()? clientMapper.mapToDto(optionalclient.get()):null;
	}

}
