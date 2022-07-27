package com.hunglp.start_mid.converter;

import com.hunglp.start_mid.constant.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GenderEnumConverter implements AttributeConverter<String, Gender> {
    @Override
    public Gender convertToDatabaseColumn(String attribute) {
        return Gender.of(attribute);
    }

    @Override
    public String convertToEntityAttribute(Gender dbData) {
        return dbData.getValue();
    }
}
