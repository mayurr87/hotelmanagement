package com.puma.dto;

import lombok.Data;

/**
 * 
 * @author Mayur R
 * 
 *         DTO Guest registration 
 *
 */
@Data
public class RegisterDTO {

	private String category_id;
	private String check_in_date;
	private String check_out_date;
	private String roomnumber;
	private String guest_id;

}
