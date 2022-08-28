package com.hunglp.start_mid.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDTO implements Serializable {

    private Long id;

    private String groupName;

    private String description;

    Set<UserDTO> usersDTO;

    RoleDTO roleDTO;

}
