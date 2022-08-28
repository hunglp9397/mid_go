package com.hunglp.start_mid.mapper;

import com.hunglp.start_mid.dto.GroupDTO;
import com.hunglp.start_mid.entity.Group;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface GroupMapper extends GenericMapper<GroupDTO, Group> {

    Set<GroupDTO> map(Set<Group> groups);

    @Override
    GroupDTO toDTO(Group entity);

    @Override
    Group toEntity(GroupDTO dto);
}
