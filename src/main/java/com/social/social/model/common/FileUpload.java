package com.social.social.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileUpload {
    private String contentType;
    private Long size;
    private String name;
    private String path;
}
