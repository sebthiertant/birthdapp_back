package com.example.birthdapp_back.controller;

import com.example.birthdapp_back.model.User;
import com.example.birthdapp_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"", "/"})
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
//
//    @GetMapping("/test")
//    public User getUsers(@PathVariable String id) {
//        System.out.println("ça marche");
//        return userService.login("GCorin", "1234");
//    }
}
