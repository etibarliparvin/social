package com.social.social.mapper;

import com.social.social.model.dto.UserDto;
import com.social.social.model.entity.User;
import com.social.social.model.request.RegisterRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    List<UserDto> toUserDto(List<User> users);

    User toUserEntity(RegisterRequest registerRequest);
}
