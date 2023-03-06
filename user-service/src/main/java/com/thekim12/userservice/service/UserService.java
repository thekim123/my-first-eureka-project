package com.thekim12.userservice.service;

import com.thekim12.userservice.dto.UserDto;
import com.thekim12.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();

    UserDto getUserDetailByUsername(String email);
}
