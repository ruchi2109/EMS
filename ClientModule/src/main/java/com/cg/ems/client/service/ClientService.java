package com.cg.ems.client.service;

import java.util.List;

import com.cg.ems.client.dto.Client;
import com.cg.ems.client.exception.NoClientFoundException;


public interface ClientService {
	
	Client addClient (Client client);
	
	List<Client> displayAllClients();
	
	Client SearchClient(int clientCode) throws NoClientFoundException;
	
	Client modifyClient(Client client);
	
	boolean deleteClient(int clientCode)throws NoClientFoundException;

}
