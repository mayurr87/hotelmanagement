package com.puma.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * 
 * @author Mayur
 * 
 * Helper class for hotel mamagement
 *
 */
public class Helper {

	private static final int NUMBER_OF_MONTHS = 6;

	public static long getTime(String date) {

		try {
			final Date dateLocal = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			return dateLocal.getTime();
		} catch (ParseException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, HotelManagementConstant.invalid_start_end_date);
		}

	}

	public static boolean isdateNotgreaterthanSixMonths(String date) {
		LocalDate localDate = LocalDate.parse(date);
		LocalDate plusMonths = LocalDate.now().plusMonths(NUMBER_OF_MONTHS);
		return localDate.isAfter(plusMonths);
	}

}
