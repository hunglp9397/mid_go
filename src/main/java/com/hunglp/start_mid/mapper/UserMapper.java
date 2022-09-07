package com.hunglp.start_mid.mapper;

import com.hunglp.start_mid.dto.UserDTO;
import com.hunglp.start_mid.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = GroupMapper.class)
public interface UserMapper extends GenericMapper<UserDTO, User> {

    @Override
    User toEntity(UserDTO dto);

    @Override
    UserDTO toDTO(User entity);

}
