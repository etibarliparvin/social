package com.social.social.service.impl;

import com.social.social.mapper.UserMapper;
import com.social.social.model.dto.UserDto;
import com.social.social.model.request.RegisterRequest;
import com.social.social.repository.UserRepository;
import com.social.social.service.RoleService;
import com.social.social.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    private final RoleService roleService;

    @Override
    public UserDto register(RegisterRequest registerRequest, MultipartFile[] files) {
        return null;
    }

    @Override
    public UserDto getUserByUsername(String username) {
        return null;
    }

    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers(Integer pageIndex, Integer pageSize) {
        return null;
    }
}
