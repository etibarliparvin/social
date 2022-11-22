package com.social.social.service.impl;

import com.social.social.mapper.RoleMapper;
import com.social.social.model.dto.RoleDto;
import com.social.social.model.entity.Role;
import com.social.social.model.enums.RoleType;
import com.social.social.model.request.CreateRoleRequest;
import com.social.social.repository.RoleRepository;
import com.social.social.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;
    private final RoleMapper mapper;

    @Override
    public RoleDto createRole(CreateRoleRequest createRoleRequest) {
        return null;
    }

    @Override
    public Role findRoleByRoleType(RoleType roleType) {
        return null;
    }
}
