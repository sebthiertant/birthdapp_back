package com.example.birthdapp_back.service;

import com.example.birthdapp_back.model.Birthday;
import com.example.birthdapp_back.repository.BirthdayRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BirthdayService {

    @Autowired
    private BirthdayRepository birthdayRepository;

    public List<Birthday> getAllBirthday() {
        return birthdayRepository.findAll();
    }

    public Birthday save(Birthday birthday) {
        return birthdayRepository.save(birthday);
    }
}
