package com.hunglp.start_mid.mapper;


import com.hunglp.start_mid.dto.PermissionDTO;
import com.hunglp.start_mid.entity.Permission;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PermissionMapper extends GenericMapper<PermissionDTO, Permission> {

    @Override
    PermissionDTO toDTO(Permission entity);

    @Override
    Permission toEntity(PermissionDTO dto);
}
