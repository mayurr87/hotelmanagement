package com.puma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

/**
 * 
 * @author Mayur R
 * 
 *         table to store guest information
 *
 */
@NoArgsConstructor
@Entity
@Table(name = "guest")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
	private Long id;

	private String first_name;
	private String last_name;
	private String mobile_number;
	
	public Guest(String first_name, String last_name, String mobile_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
	}
	
	
	

}
