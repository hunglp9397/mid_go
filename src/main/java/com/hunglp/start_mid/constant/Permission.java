package com.hunglp.start_mid.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum Permission {
    READ("r"),
    WRITE("w"),
    EXECUTE("e");

    private String value;

    private static HashMap<String, Permission> permissionMap = new HashMap<>();

    static {
        for(Permission permission : permissionMap.values()){
            permissionMap.put(permission.value, permission);
        }
    }

    public static Permission of(String value){
        return permissionMap.get(value);
    }





}
