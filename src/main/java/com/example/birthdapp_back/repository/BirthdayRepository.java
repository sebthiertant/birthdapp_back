package com.example.birthdapp_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.birthdapp_back.model.Birthday;

import java.util.Optional;

@Repository
public interface BirthdayRepository extends JpaRepository<Birthday, Long> {
    Optional<Birthday> findById(Long id);
}
