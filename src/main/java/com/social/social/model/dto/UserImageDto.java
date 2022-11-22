package com.social.social.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserImageDto {
    private Long id;
    private String mediaType;
    private Long size;
    private String name;
    private String path;
    private Long userId;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    private LocalDateTime createdDate;
    private String createdBy;
    private Boolean enable;
}