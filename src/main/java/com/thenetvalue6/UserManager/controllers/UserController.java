package com.thenetvalue6.UserManager.controllers;

import com.thenetvalue6.UserManager.exceptions.EmailExistsException;
import com.thenetvalue6.UserManager.model.User;
import com.thenetvalue6.UserManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showUser() {
        return "ciao!";
    }


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception, EmailExistsException {
        User newUser = userService.register(user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail(), user.getPassword());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> allUsers = userService.getUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

}
