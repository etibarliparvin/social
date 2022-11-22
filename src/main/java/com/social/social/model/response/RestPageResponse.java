package com.social.social.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestPageResponse<T> {
    private List<T> data;
    private Long totalElement;
    private Integer totalPages;
    private Integer number;
    private Integer size;
}
