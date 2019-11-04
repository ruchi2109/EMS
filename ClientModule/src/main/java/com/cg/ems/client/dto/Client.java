package com.cg.ems.client.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;

@Entity
//@GenericGenerator(name = "client_code_seq", strategy = "increment")
@Table(name = "client")
public class Client {
	@Id
	//@GeneratedValue(generator = "client_code_seq", strategy = GenerationType.SEQUENCE)
	private int clientCode;
	
	@Pattern(regexp = "[A-Z][a-z]{2,15}")
	@NotBlank(message = "Name is mandatory, cannot be null")
	private String clientName;

	private String clientCredibility;
	
	private String clientEmail;

	@NotBlank(message = "ProjectName is mandatory, cannot be null")
	private String clientProjectName;

	
	public int getClientCode() {
		return clientCode;
	}

	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientCredibility() {
		return clientCredibility;
	}

	public void setClientCredibility(String clientCredibility) {
		this.clientCredibility = clientCredibility;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientProjectName() {
		return clientProjectName;
	}

	public void setClientProjectName(String clientProjectName) {
		this.clientProjectName = clientProjectName;
	}

}
