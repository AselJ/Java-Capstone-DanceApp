package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.LessonDto;
import com.devmountain.DanceApp.dtos.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RegistrationService {
    @Transactional
    List<String> addUser(UserDto userDto);

    @Transactional
    List<String> addLesson(LessonDto lessonDto);
}
