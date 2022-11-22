package com.social.social.model.enums;

import java.util.Arrays;

public enum RoleType {

    ROLE_USER, ROLE_ADMIN;

    public static RoleType get(String role) {
        return Arrays.stream(RoleType.values())
                .filter(roleType -> roleType.name().equals(role))
                .findFirst()
                .orElse(null);
    }
}
