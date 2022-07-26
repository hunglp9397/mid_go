package com.hunglp.start_mid.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("admin"),
    USER("user");

    private String value;

    private static HashMap<String, Role> roleMap = new HashMap<>();

    static {
        for (Role role : Role.values()) {
            roleMap.put(role.value, role);
        }
    }

    public static Role of(String value) {
        return roleMap.get(value);
    }

}
