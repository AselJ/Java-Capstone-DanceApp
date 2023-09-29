package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.entities.User;
import com.devmountain.DanceApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private String passwordEncoder;

    @Override
    @Transactional
    public List<String> addUser(UserDto userDto) {
        List<String> response = new ArrayList<>();
        User user = new User(userDto);
        userRepository.saveAndFlush(user);
        response.add("User Successfully Added");
        return response;
    }

    @Override
    public List<String> userLogin(UserDto userDto) {
        List<String> response = new ArrayList<>();
        Optional<User> userOptional = userRepository.findByUserId(userDto.getUsername());
        if (userOptional.isPresent()) {

            if (passwordEncoder.matches(userDto.getPassword())) {
                response.add("User Login Successful");
                response.add(String.valueOf(userOptional.get().getId()));
            } else {
                response.add("Username or password incorrect");
            }
        } else {
            response.add("Username or password incorrect");
        }
        return response;
    }

    @Override
    public Optional<UserDto> getUserById(Long userId) {
        return Optional.empty();
    }

}

