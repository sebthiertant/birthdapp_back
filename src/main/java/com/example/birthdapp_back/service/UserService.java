package com.example.birthdapp_back.service;

import com.example.birthdapp_back.model.User;
import com.example.birthdapp_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service("user")
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String username, String password)  {
        Optional<User> optionalUser = userRepository.findByUsernameAndPassword(username, password);

        System.out.println("-----------> " + optionalUser);

        if (!optionalUser.isPresent()) {
            return new User();
        }
        System.out.println(optionalUser.get());
        return new User();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

}
