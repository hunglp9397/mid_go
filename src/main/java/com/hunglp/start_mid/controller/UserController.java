package com.hunglp.start_mid.controller;


import com.hunglp.start_mid.dto.UserDTO;
import com.hunglp.start_mid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    Page<UserDTO> getAllUser(Pageable pageable){
        return userService.getAllUser(pageable);
    }

}
