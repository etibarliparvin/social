package com.social.social.service.impl;

import com.social.social.exception.FileException;
import com.social.social.model.common.FileUpload;
import com.social.social.service.FileStorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.social.social.util.FileUtil.UPLOAD_DIR;
import static java.lang.String.format;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileStorageServiceImpl implements FileStorageService {
    private final Path uploadPath;

    public FileStorageServiceImpl() {
        this.uploadPath = Paths.get(UPLOAD_DIR);
    }

    @Override
    public List<FileUpload> uploadFiles(MultipartFile[] multipartFiles) {
        init();
        return Arrays.stream(multipartFiles)
                .map(multipartFile -> {
                    File file = new File(UPLOAD_DIR + LocalDateTime.now() + "_" + multipartFile.getOriginalFilename());
                    try {
                        Files.write(file.toPath(), multipartFile.getBytes());
                    } catch (IOException e) {
                        throw new FileException(format("Could not write file to directory: %s", file.toPath()), e);
                    }
                    log.info("File: {} successfully saved in directory: {}", file.getName(), file.getAbsoluteFile());
                    return FileUpload.builder()
                            .path(file.getAbsoluteFile().toString())
                            .size(multipartFile.getSize())
                            .contentType(multipartFile.getContentType())
                            .name(file.getName())
                            .build();
                }).collect(Collectors.toList());
    }

    private void init() {
        if (!Files.isDirectory(uploadPath)) {
            log.info("File does not exist in directory: {}", UPLOAD_DIR);
            try {
                Files.createDirectories(uploadPath);
            } catch (IOException e) {
                throw new FileException(format("Could not create file in directory: %s", UPLOAD_DIR), e);
            }
        }
        log.info("File successfully init!");
    }
}
