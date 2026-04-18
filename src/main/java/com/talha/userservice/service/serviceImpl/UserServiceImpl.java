package com.talha.userservice.service.serviceImpl;

import com.talha.userservice.dto.UserDto;
import com.talha.userservice.dto.UserRegisterDto;
import com.talha.userservice.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;    

    @Override
    public UserDto getUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserDto createUser(UserRegisterDto user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public UserDto updateUser(Long id, UserRegisterDto user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
