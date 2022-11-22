package com.social.social.model.enums;

import java.util.Arrays;

public enum Gender {
    MALE, FEMALE;

    public static Gender get(String gender) {
        return Arrays.stream(Gender.values())
                .filter(genderType -> genderType.name().equals(gender))
                .findFirst()
                .orElse(null);
    }
}
