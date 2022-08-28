package com.hunglp.start_mid.mapper;

import com.hunglp.start_mid.dto.RoleDTO;
import com.hunglp.start_mid.entity.Role;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RoleMapper extends GenericMapper<RoleDTO, Role> {
}
