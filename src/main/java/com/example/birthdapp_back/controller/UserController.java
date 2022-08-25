package com.example.birthdapp_back.controller;

import com.example.birthdapp_back.model.Birthday;
import com.example.birthdapp_back.model.User;
import com.example.birthdapp_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BirthdayService birthdayService;


    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") Long id) {
        try {
            User user = userService.getUserByID(id);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/{userId}/birthdays")
    public ResponseEntity<Birthday> createBirthday(
            @PathVariable("userId") Long id,
            @RequestParam("firstname") final String firstname,
            @RequestParam("lastname") final String lastname,
            @RequestParam("date") final String date) {

        try {
            User user = userService.getUserByID(id);
            Birthday birthday = new Birthday(null, LocalDate.parse(date), firstname, lastname, user);
            return ResponseEntity.ok(birthdayService.save(birthday));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
