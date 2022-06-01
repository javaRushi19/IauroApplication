package com.iauro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {

	@Id
	@GeneratedValue
	private Integer custId;
	private String username;
	private String password;
	private String custName;
	private String custAddress;
	
	
	
}
