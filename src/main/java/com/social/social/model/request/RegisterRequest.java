package com.social.social.model.request;

import com.social.social.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotBlank // NotNull -> NotEmpty (null, "") -> NotBlank(null, "", "  ")
    private String firstName;
    @NotBlank
    private String username;
    // @MatchPassword
    private String password;
    @NotNull
    private Gender gender;
}