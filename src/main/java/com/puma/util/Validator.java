package com.puma.util;

import static com.puma.util.Helper.isdateNotgreaterthanSixMonths;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.puma.dto.RegisterDTO;

/**
 * 
 * @author Mayur Rahatekar
 * 
 * validation 
 *
 */
public class Validator {

	public static void validate(RegisterDTO registerDTO) {

		boolean checkindate = isdateNotgreaterthanSixMonths(registerDTO.getCheck_in_date());
		boolean checkoutdate = isdateNotgreaterthanSixMonths(registerDTO.getCheck_out_date());

		if (checkindate && checkoutdate) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, HotelManagementConstant.invalid_start_end_date);

		}

	}
}
