package com.puma.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Mayur R
 * 
 *         DTO Guest HotelDTO
 *
 */

@Builder
@Data
public class HotelDTO {
	private String catrgoryId;
	private String category;
	private String price;
	private String roomNumber;
	private String description;
}
