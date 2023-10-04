package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);

    Optional<UserDto> getUserById(Long userId);

    List<UserDto> getAllUsers();

    void deleteUserById(Long userId);

    void updateUser(UserDto userDto);
}
