package com.talha.userservice.mapper;

import com.talha.userservice.dto.UserDto;
import com.talha.userservice.dto.UserRegisterDto;
import com.talha.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
    componentModel = "spring", 
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {

    /**
     * Converts an Entity to an Output DTO.
     * Safe for responses: The 'password' field is naturally dropped 
     * because it does not exist in UserDto.
     */
    UserDto toDto(User user);

    /**
     * Converts a List of Entities to a List of Output DTOs.
     * MapStruct automatically implements this by iterating over the toDto() method.
     */
    List<UserDto> toDtoList(List<User> users);

    /**
     * Converts an Incoming Registration DTO to an Entity.
     * The 'id' is ignored because the database will generate it upon saving.
     */
    @Mapping(target = "id", ignore = true)
    User toEntity(UserRegisterDto userRegisterDto);

    /**
     * Updates an existing User entity with data from a DTO.
     * Highly useful for PUT/PATCH REST endpoints. 
     * The 'id' is ignored to prevent accidental overwriting of the primary key.
     */
    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(UserRegisterDto userRegisterDto, @MappingTarget User user);
}