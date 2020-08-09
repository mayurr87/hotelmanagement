package com.puma.service.impl;

import static com.puma.util.Helper.getTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.puma.dto.RegisterDTO;
import com.puma.model.Register;
import com.puma.repository.RegisterRepository;
import com.puma.service.IRegister;
import com.puma.util.HotelManagementConstant;
import com.puma.util.Validator;

/**
 * 
 * @author Mayur R
 * 
 *         Implementation IRegister
 *
 */
@Service
public class RegisterImpl implements IRegister {

	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public void register(RegisterDTO registerDTO) {

		Validator.validate(registerDTO);

		List<Register> findUserByStatusAndName = registerRepository.findUserByStatusAndName(registerDTO.getRoomnumber(),
				getTime(registerDTO.getCheck_in_date()), getTime(registerDTO.getCheck_out_date()));

		if (!findUserByStatusAndName.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, HotelManagementConstant.room_already_book);
		}
		// TODO Auto-generated method stub
		Register register = new Register(registerDTO.getCategory_id(), System.currentTimeMillis(),
				getTime(registerDTO.getCheck_in_date()), getTime(registerDTO.getCheck_out_date()),
				registerDTO.getRoomnumber(), registerDTO.getGuest_id());

		registerRepository.save(register);

	}

}
