package com.social.social.service;

import com.social.social.model.dto.RoleDto;
import com.social.social.model.entity.Role;
import com.social.social.model.enums.RoleType;
import com.social.social.model.request.CreateRoleRequest;

public interface RoleService {
    RoleDto createRole(CreateRoleRequest createRoleRequest);

    Role findRoleByRoleType(RoleType roleType);
}
