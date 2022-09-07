package com.hunglp.start_mid.repository;

import com.hunglp.start_mid.dto.UserDTO;
import com.hunglp.start_mid.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select u from User u left join fetch u.groups g left join fetch u.roles ",
            countQuery = "select count(u) from User u left join fetch u.roles r join fetch u.roles ")
    List<User> getUser();



}
