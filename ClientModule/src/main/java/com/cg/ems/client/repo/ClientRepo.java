package com.cg.ems.client.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.net.server.Client;

public interface ClientRepo extends JpaRepository<Client, Integer> {
	
	

}
