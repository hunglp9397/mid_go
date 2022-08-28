package com.hunglp.start_mid.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO implements Serializable {

    private Long id;

    private String roleName;

    private String description;

    private Set<UserDTO> usersDTO;

    private Set<PermissionDTO> permissionsDTO;

    private GroupDTO groupDTO;
}
