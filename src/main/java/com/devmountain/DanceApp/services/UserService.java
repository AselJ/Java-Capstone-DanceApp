package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //List<UserDto> getAllUsers();
    @Transactional
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);

    //Optional<UserDto> getUserById(Long userId);

    //void deleteUserById(Long userId);

    //void updateUser(UserDto userDto);
}
