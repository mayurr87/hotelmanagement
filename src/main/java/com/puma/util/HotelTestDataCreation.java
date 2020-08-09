package com.puma.util;

import java.util.ArrayList;
import java.util.List;

import com.puma.dto.HotelDTO;

/**
 * 
 * @author Mayur
 * 
 * Dummy data creation
 *
 */
public class HotelTestDataCreation {

	public static List<HotelDTO> getHotelInfo() {

		final HotelDTO hotelDTO1 = HotelDTO.builder().catrgoryId("deluxe_rooms").category("Deluxe Rooms")
				.price("Rs 7000/night").roomNumber(" (A 01 - 05)  B( 01 - 05)  C(01 - 05)  D(01 -05)")
				.description("Deluxe Rooms - Queen Size Bed").build();
		final HotelDTO hotelDTO2 = HotelDTO.builder().catrgoryId("luxury_rooms").category("Luxury Rooms")
				.price("Rs 8500/night").roomNumber("A(06 - 10) B(06 -10) C(06 - 10) D (06 - 10)")
				.description("Luxury Rooms - Queen Size Bed and Pool Facing").build();
		final HotelDTO hotelDTO3 = HotelDTO.builder().catrgoryId("luxury_suites").category("Luxury Suites")
				.price("(Rs 12000/night)").roomNumber("D(11 - 20) E(01 - 02)")
				.description("Luxury Suites - King Size Bed and Pool Facing").build();
		final HotelDTO hotelDTO4 = HotelDTO.builder().catrgoryId("presidential_suites").category("Presidential Suites")
				.price("Rs 20000/night").roomNumber("E (03 - 10)")
				.description("Presidential Suites - King Size Bed, Pool Facing with a Gym").build();

		final List<HotelDTO> listHotelDTO = new ArrayList<>();
		listHotelDTO.add(hotelDTO1);
		listHotelDTO.add(hotelDTO2);
		listHotelDTO.add(hotelDTO3);
		listHotelDTO.add(hotelDTO4);

		return listHotelDTO;

	}

}
