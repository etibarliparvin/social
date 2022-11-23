package com.social.social.mapper;

import com.social.social.model.common.FileUpload;
import com.social.social.model.entity.UserImage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserImageMapper {
    UserImage forCreation(FileUpload fileUpload);

    List<UserImage> forCreation(List<FileUpload> fileUploadList);
}
