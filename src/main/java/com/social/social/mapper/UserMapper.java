package com.social.social.mapper;

import com.social.social.model.dto.UserDto;
import com.social.social.model.entity.User;
import com.social.social.model.request.RegisterRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public abstract UserDto toUserDto(User user);
    public abstract List<UserDto> toUserDto(List<User> users);
    public abstract User toUserEntity(RegisterRequest registerRequest);
}
