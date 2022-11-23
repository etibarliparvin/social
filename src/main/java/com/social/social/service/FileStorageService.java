package com.social.social.service;

import com.social.social.model.common.FileUpload;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileStorageService {
    List<FileUpload> uploadFiles(MultipartFile[] multipartFiles);
}
