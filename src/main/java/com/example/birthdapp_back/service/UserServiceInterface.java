package com.example.birthdapp_back.service;

import com.example.birthdapp_back.model.User;
import java.util.List;


public interface UserServiceInterface {

    public User login(String username, String password);
    public List<User> getAllUsers();
    public User save(User user);

}
