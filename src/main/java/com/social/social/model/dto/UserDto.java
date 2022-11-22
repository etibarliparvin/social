package com.social.social.model.dto;

import com.social.social.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Gender gender;
    private Long roleId;
    private Set<UserImageDto> userImages;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    private LocalDateTime createdDate;
    private String createdBy;
    private Boolean enable;
}