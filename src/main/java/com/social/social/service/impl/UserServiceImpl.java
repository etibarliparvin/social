package com.social.social.service.impl;

import com.social.social.exception.DomainExistsException;
import com.social.social.mapper.UserMapper;
import com.social.social.model.dto.UserDto;
import com.social.social.model.entity.User;
import com.social.social.model.entity.UserImage;
import com.social.social.model.request.RegisterRequest;
import com.social.social.repository.UserRepository;
import com.social.social.service.FileStorageService;
import com.social.social.service.RoleService;
import com.social.social.service.UserImageService;
import com.social.social.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;

import static java.lang.String.format;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    private final FileStorageService fileStorageService;
    private final UserImageService userImageService;

    @Override
    @Transactional
    public UserDto register(RegisterRequest registerRequest, MultipartFile[] files) {
        checkUniqueProperties(registerRequest);
        User user = mapper.toUserEntity(registerRequest);
        List<UserImage> userImageList = userImageService
                .createUserImages(fileStorageService.uploadFiles(files));
        user.setUserImages(new HashSet<>(userImageList));
        return mapper.toUserDto(repository.saveAndFlush(user));
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

    @Override
    public Boolean existUserByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public Boolean existUserById(Long id) {
        return repository.existsById(id);
    }

    // strategy design pattern ile evez et
    private void checkUniqueProperties(RegisterRequest registerRequest) {
        if (existUserByUsername(registerRequest.getUsername())) {
            throw new DomainExistsException(format("User exists by username: %s", registerRequest.getUsername()));
        }
    }
}
