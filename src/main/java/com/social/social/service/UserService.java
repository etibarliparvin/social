package com.social.social.service;

import com.social.social.model.dto.UserDto;
import com.social.social.model.request.RegisterRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    UserDto register(RegisterRequest registerRequest, MultipartFile[] files);

    UserDto getUserByUsername(String username);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers(Integer pageIndex, Integer pageSize);
}
