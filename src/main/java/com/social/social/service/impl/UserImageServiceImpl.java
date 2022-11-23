package com.social.social.service.impl;

import com.social.social.mapper.UserImageMapper;
import com.social.social.model.common.FileUpload;
import com.social.social.model.entity.UserImage;
import com.social.social.repository.UserImageRepository;
import com.social.social.service.UserImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserImageServiceImpl implements UserImageService {
    private final UserImageRepository repository;
    private final UserImageMapper mapper;

    @Override
    public List<UserImage> createUserImages(List<FileUpload> fileUploadList) {
        return mapper.forCreation(fileUploadList);
    }
}
