package com.cg.ems.client.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.client.dto.Client;
import com.cg.ems.client.exception.NoClientFoundException;
import com.cg.ems.client.service.ClientService;


@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public Client addNewClient(@RequestBody Client client) {
		return service.addClient(client);
	}

	@GetMapping(produces = "application/json")
	public List<Client> getAllClients() {
		return service.displayAllClients();
	}

	@GetMapping(value = "/clientCode/{clientCode}", produces = "application/json")
	public Client searchByClientCode(@PathVariable int clientCode) throws NoClientFoundException {
		return service.SearchClient(clientCode);
	}

	@DeleteMapping(value = "/delete/{clientCode}", produces = "application/json")
	public boolean removeByClientCode(@PathVariable int clientCode) throws NoClientFoundException {
		return service.deleteClient(clientCode);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Client updateClient(@RequestBody Client client) {
		return service.modifyClient(client);
	}
}
