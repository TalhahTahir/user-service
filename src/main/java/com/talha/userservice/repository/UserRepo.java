package com.talha.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talha.userservice.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
