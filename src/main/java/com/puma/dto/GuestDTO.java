package com.puma.dto;

import lombok.Data;

/**
 * 
 * @author Mayur R
 * 
 *         DTO Guest Info
 *
 */
@Data
public class GuestDTO {
	private long id;
	private String first_name;
	private String last_name;
	private String mobile_number;
}
