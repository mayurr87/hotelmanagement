package com.puma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puma.dto.HotelDTO;
import com.puma.dto.RegisterDTO;
import com.puma.service.IRegister;
import com.puma.util.HotelTestDataCreation;

/**
 * 
 * @author Mayur R
 * 
 *         Controller to hotel operation
 *
 */
@RestController
@RequestMapping("hotel")
public class HotelController {

	@Autowired
	private IRegister iregister;

	@GetMapping
	public List<HotelDTO> getAllIternary() {
		return HotelTestDataCreation.getHotelInfo();

	}

	@PostMapping
	public void bookHotel(@RequestBody RegisterDTO registerDTO) {
		iregister.register(registerDTO);
	}
}
