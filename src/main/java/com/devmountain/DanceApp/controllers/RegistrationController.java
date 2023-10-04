package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.dtos.RegistrationDto;
import com.devmountain.DanceApp.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/all")
    public List<RegistrationDto> getAllRegistration()
    {
        return registrationService.getAllRegistration();
    }

    @PostMapping("/add")
    public void addRegistration(@RequestBody RegistrationDto registrationDto)
    {
        registrationService.addRegistration(registrationDto);
    }

    @DeleteMapping("/delete/{registrationId}")
    public void deleteRegistrationById(@PathVariable Long registrationId)
    {
        registrationService.deleteRegistrationById(registrationId);
    }

    @PutMapping("/update")
    public void updateRegistration(@RequestBody RegistrationDto registrationDto)
    {
        registrationService.updateRegistration(registrationDto);
    }









//    @GetMapping("/user/{userId}")
//    public Optional<UserDto> getUsersByUser(@PathVariable Long userId){
//        return userService.getUserById(userId);
//    }
//
//    @DeleteMapping("/{userId}")
//    public void DeleteUserById(@PathVariable Long userId){
//        userService.getUserById(userId);
//    }
//
//    @PutMapping
//    public void updateUser(@RequestBody UserDto userDto){
//        userService.getUserById(userDto.getId());
//    }
//
//    @GetMapping("/{userId}")
//    public Optional<UserDto> getAllUsersById(@PathVariable Long userId){
//        return userService.getUserById(userId);
//    }

//    @Autowired
//    private LessonService lessonService;
//
//    private class LessonService
//    {
//    }
}
