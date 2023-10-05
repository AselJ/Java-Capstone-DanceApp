package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.entities.User;
//import com.devmountain.DanceApp.repositories.RegistrationRepository;
import com.devmountain.DanceApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    private PasswordEncoder passwordEncoder;

//  /  @Autowired
//    private RegistrationRepository registrationRepository;

// /   public List<UserDto> getAllUsers() {
//        List<User> userList = userRepository.findAll();
//        return userList.stream().map(user -> new UserDto(user)).collect(Collectors.toList());
//    }
    @Override
    @Transactional
    public List<String> addUser(UserDto userDto) {
        List<String> response = new ArrayList<>();
        User user = new User(userDto);
        userRepository.saveAndFlush(user);
        response.add("User Added Successfully");
        return response;
    }
    @Override
    public List<String> userLogin(UserDto userDto) {
        List<String> response = new ArrayList<>();
        Optional<User> userOptional = userRepository.findByUsername(userDto.getUsername());
        if (userOptional.isPresent()) {
            if (passwordEncoder.matches(userDto.getPassword(), userOptional.get().getPassword())) {
                response.add("User Login Successful");
                response.add(String.valueOf(userOptional.get().getId()));
                response.add(String.valueOf(userOptional.get().getUsername()));
            } else {
                response.add("Username or password incorrect");
            }

        } else {
            response.add("Username or password incorrect");
        }
        return response;
    }
//    @Override
//    public Optional<UserDto> getUserById(Long userId) {
//        return Optional.empty();
//    }

//    @Override
//    public void deleteUserById(Long userId) {
//        Optional<User> userOptional = userRepository.findById(userId);
//        userOptional.ifPresent(user -> userRepository.delete(user));
//    }
//    @Override
//    public void updateUser(UserDto userDto) {
//        Optional<User> userOptional = userRepository.findById(userDto.getId());
//        userOptional.ifPresent(user -> {
//            user.setUsername(userDto.getUsername());
//            user.setPassword(userDto.getPassword());
//            userRepository.saveAndFlush(user);
//        });
    }


