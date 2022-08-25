package com.example.birthdapp_back.service;

import com.example.birthdapp_back.model.User;
import com.example.birthdapp_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service("user")
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) throws Exception {
        return userRepository.findByUsernameAndPassword(username, password).orElseThrow(Exception::new);
    }

    public User getUserById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(Exception::new);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public User loadByUsername(String username) throws Exception {
        return userRepository.findByUsername(username).orElseThrow(Exception::new);
    }


}
