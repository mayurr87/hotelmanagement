package com.puma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

/**
 * 
 * @author Mayur Rahatekar
 * 
 * table to store registration information
 *
 */
@NoArgsConstructor
@Entity
@Table(name = "hotel_register")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
	private Long id;

	private String category_id;
	private Long booking_date;
	private Long check_in_date;
	private Long check_out_date;
	private String roomnumber;
	private String guest_id;

	public Register(String category_id, Long booking_date, Long check_in_date, Long check_out_date, String roomnumber,
			String guest_id) {
		super();
		this.category_id = category_id;
		this.booking_date = booking_date;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.roomnumber = roomnumber;
		this.guest_id = guest_id;
	}

}
