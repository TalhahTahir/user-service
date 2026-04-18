package com.talha.userservice.dto;

import com.talha.userservice.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    private Long id;
    private String name;
    private String email;
    private UserType userType;
    private String phoneNumber;

}
