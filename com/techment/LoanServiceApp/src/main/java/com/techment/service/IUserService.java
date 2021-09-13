package com.techment.service;

import java.util.Optional;

import com.techment.dto.UserDto;

public interface IUserService {

	UserDto login(String username,String password);
	Optional<UserDto> findUserByToken(String token);
}
