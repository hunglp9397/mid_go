package com.hunglp.start_mid.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("m"),
    FEMALE("f"),
    HIDDEN("h");

    private String value;

    private static HashMap<String,Gender> genderMap = new HashMap<>();

    static {
        for(Gender gender : Gender.values()){
            genderMap.put(gender.value, gender);
        }
    }

    public static Gender of(String value){
        return genderMap.get(value);
    }






}
