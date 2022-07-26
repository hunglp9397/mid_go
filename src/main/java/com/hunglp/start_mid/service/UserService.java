package com.hunglp.start_mid.service;

import com.hunglp.start_mid.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService {

    Page<UserDTO> getAllUser(Pageable pageable);
}
