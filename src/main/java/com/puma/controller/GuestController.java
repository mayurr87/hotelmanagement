package com.puma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puma.dto.GuestDTO;
import com.puma.service.IGuest;

/**
 * 
 * @author Mayur R
 * 
 *         Controller to register Guest
 *
 */

@RestController
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	private IGuest guest;

	@PostMapping
	public void registerGuest(@RequestBody GuestDTO guestDTO) {
		guest.registerGuest(guestDTO);

	}
}
