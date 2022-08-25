package com.example.birthdapp_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.birthdapp_back.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    Optional<User> findByUsernameAndPassword(String username, String password);
    Optional<User> findByUsername(String username);
}
