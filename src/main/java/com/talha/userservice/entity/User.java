package com.talha.userservice.entity;

import com.talha.userservice.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private Long id;
    private String name;
    private String email;
    private UserType userType;
    private String password;
    private String phoneNumber;
}
