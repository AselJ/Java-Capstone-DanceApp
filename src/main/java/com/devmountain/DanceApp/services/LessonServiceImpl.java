package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.LessonDto;
//import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.Registration;
//import com.devmountain.DanceApp.entities.User;
import com.devmountain.DanceApp.repositories.LessonRepository;
import com.devmountain.DanceApp.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonServiceImpl {
    @Autowired
    private LessonRepository lessonRepository;

    @Transactional
    public List<String> addLesson(LessonDto lessonDto) {
        List<String> response = new ArrayList<>();
        Lesson lesson = new Lesson(lessonDto);
        lessonRepository.saveAndFlush(lesson);
        response.add("Lesson Added Successfully");
        return response;
    }
}
