package com.talha.userservice.service;

import com.talha.userservice.dto.UserDto;
import com.talha.userservice.dto.UserRegisterDto;

public interface UserService {
    
    UserDto getUserById(Long id);
    UserDto createUser(UserRegisterDto user);
    UserDto updateUser(Long id, UserRegisterDto user);
    void deleteUser(Long id);

}
