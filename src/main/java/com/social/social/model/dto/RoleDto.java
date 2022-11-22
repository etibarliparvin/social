package com.social.social.model.dto;

import com.social.social.model.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private Long id;
    private RoleType roleType;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    private LocalDateTime createdDate;
    private String createdBy;
    private Boolean enable;
}