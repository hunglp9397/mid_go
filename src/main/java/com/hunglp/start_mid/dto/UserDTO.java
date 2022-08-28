package com.hunglp.start_mid.dto;

import com.hunglp.start_mid.entity.Group;
import com.hunglp.start_mid.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private Long id;

    private String username;

    private String password;

    private Set<GroupDTO> groupsDTO;

    private Set<RoleDTO> rolesDTO;

}
