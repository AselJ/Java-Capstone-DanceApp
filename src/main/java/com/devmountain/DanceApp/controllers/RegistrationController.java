package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public List<UserDto> getUsersByUser(@PathVariable Long userId){
        return userService.getAllUsersByUser(userId);
    }

    @DeleteMapping("/{userId}")
    public void DeleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDto userDto){
        userService.updateUserById(userDto);
    }

    @GetMapping("/{userId}")
    public Optional<UserDto> getAllUsersById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @Autowired
    private LessonService lessonService;





}
