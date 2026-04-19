package com.talha.userservice.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.talha.userservice.dto.UserDto;
import com.talha.userservice.dto.UserRegisterDto;
import com.talha.userservice.entity.User;
import com.talha.userservice.mapper.UserMapper;
import com.talha.userservice.repository.UserRepo;
import com.talha.userservice.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;

    @Override
    public UserDto getUserById(Long id) {
        User u = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userMapper.toDto(u);
    }

    @Override
    public UserDto createUser(UserRegisterDto user) {

        User u = userMapper.toEntity(user);
        u = userRepo.save(u);
        return userMapper.toDto(u);
    }

    @Override
    public UserDto updateUser(Long id, UserRegisterDto user) {

        User u = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        userMapper.updateEntityFromDto(user, u);
        u = userRepo.save(u);
        return userMapper.toDto(u);
    }

    @Override
    public void deleteUser(Long id) {

        User u = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        userRepo.delete(u);
    }

}
