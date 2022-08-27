package com.hunglp.start_mid.repository;

import com.hunglp.start_mid.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {




}
