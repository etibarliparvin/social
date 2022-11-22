package com.social.social.mapper;

import com.social.social.model.dto.RoleDto;
import com.social.social.model.entity.Role;
import com.social.social.model.request.CreateRoleRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto toRoleDto(Role role);

    List<RoleDto> toRoleDto(List<Role> roles);

    Role toRoleEntity(CreateRoleRequest createRoleRequest);
}
