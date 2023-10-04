package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.LessonDto;
import com.devmountain.DanceApp.dtos.RegistrationDto;
import com.devmountain.DanceApp.dtos.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface RegistrationService {
    List<RegistrationDto> getAllRegistration();

    List<String> addUser(UserDto userDto);

    List<String> addLesson(LessonDto lessonDto);

    void addRegistration(RegistrationDto registrationDto);

    void deleteRegistrationById(Long registrationId);

    void updateRegistration(RegistrationDto registrationDto);
}
