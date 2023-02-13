package com.example.demoSecurity3.repository;

import com.example.demoSecurity3.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);

}
