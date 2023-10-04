package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")

    public List<UserDto> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/add")
    public List<String> addUser(@RequestBody UserDto userDto){
        String passHash = passwordEncoder.encode(userDto.getPassword());
        // userDto.setPassword(Boolean.parseBoolean(passHash));
        return userService.addUser(userDto);
    }

//    @PostMapping("/login")
//    public List<String> userLogin(@RequestBody UserDto userDto){
//        return userService.userLogin(userDto);
//    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUserById(@PathVariable Long userId)
    {
        userService.deleteUserById(userId);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody UserDto pokemonDto)
    {

    }

}


