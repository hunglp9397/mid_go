package com.hunglp.start_mid.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionDTO implements Serializable {

    private Long id;

    private String permissionName;

    private String description;

    Set<RoleDTO> rolesDTO;
}
