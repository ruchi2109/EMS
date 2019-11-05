package com.cg.ems.client.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.client.dto.Client;



public interface ClientRepo extends JpaRepository<Client, Integer> {
	
	

}
