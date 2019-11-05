package com.cg.ems.client.service;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.client.dto.Client;
import com.cg.ems.client.exception.NoClientFoundException;
import com.cg.ems.client.repo.ClientRepo;

@Service
@Transactional(rollbackOn = NoClientFoundException.class)
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepo repo; 
	
	
	@Override
	public Client addClient(Client client) {
		return repo.save(client);
	}

	@Override
	public List<Client> displayAllClients() {
		return repo.findAll();
	}

	@Override
	public Client SearchClient(int clientCode) throws NoClientFoundException{
		 try {
			return repo.findById(clientCode).get();
		} catch (Exception e) {
			throw new NoClientFoundException("No Client with such code found" + clientCode);
		}
		 
				
	}

	@Override
	public Client modifyClient(Client client) {
		return repo.save(client);
	}

	@Override
	public boolean deleteClient(int clientCode) throws NoClientFoundException{
		 try {
			repo.deleteById(clientCode);
			return true;
		} catch (Exception e) {
			throw new NoClientFoundException("Client with such Id not found to delete" + clientCode);
		}
	}

}
