package com.example.birthdapp_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.birthdapp_back.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
