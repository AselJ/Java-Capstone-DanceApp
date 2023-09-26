package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public List<String> addUser(@RequestBody UserDto userDto){
        String passHash = passwordEncoder.encode(userDto.getPassword());
        // userDto.setPassword(Boolean.parseBoolean(passHash));
        return userService.addUser(userDto);
    }

    @PostMapping("/login")
    public List<String> userLogin(@RequestBody UserDto userDto){
        return userService.userLogin(userDto);
    }
}

