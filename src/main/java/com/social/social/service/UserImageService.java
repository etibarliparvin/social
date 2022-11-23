package com.social.social.service;

import com.social.social.model.common.FileUpload;
import com.social.social.model.entity.UserImage;

import java.util.List;

public interface UserImageService {
    List<UserImage> createUserImages(List<FileUpload> fileUploadList);
}
