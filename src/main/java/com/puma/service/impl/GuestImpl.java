package com.puma.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puma.dto.GuestDTO;
import com.puma.model.Guest;
import com.puma.repository.GuestRespository;
import com.puma.service.IGuest;

/**
 * 
 * @author Mayur R
 * 
 *         Implementation IGuest
 *
 */
@Service
public class GuestImpl implements IGuest {

	@Autowired
	private GuestRespository guestRespository;

	@Override
	public void registerGuest(GuestDTO guestDTO) {
		Guest guest = new Guest(guestDTO.getFirst_name(), guestDTO.getLast_name(), guestDTO.getMobile_number());
		// TODO Auto-generated method stub
		guestRespository.save(guest);

	}

}
