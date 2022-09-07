package com.hunglp.start_mid.service.impl;


import com.hunglp.start_mid.dto.UserDTO;
import com.hunglp.start_mid.entity.User;
import com.hunglp.start_mid.mapper.UserMapper;
import com.hunglp.start_mid.repository.UserRepository;
import com.hunglp.start_mid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;


    @Override
    public Page<UserDTO> getAllUser(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toDTO);
    }
}
