package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.LessonDto;
import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.User;
import com.devmountain.DanceApp.repositories.LessonRepository;
import com.devmountain.DanceApp.repositories.RegistrationRepository;
import com.devmountain.DanceApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LessonRepository lessonRepository;
    private Lesson userId;

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
    @Transactional
    public List<String> addLesson(LessonDto lessonDto) {
        List<String> response = new ArrayList<>();
        Lesson lesson = new Lesson(lessonDto);
        lessonRepository.saveAndFlush(lesson);
        response.add("Lesson Successfully Added");
        return response;
    }

    @Transactional
    public void deleteUserById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        userOptional.ifPresent(user -> userRepository.delete(user));
    }
    @Transactional
    public void deleteLessonById(Long lessonId) {
        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
        lessonOptional.ifPresent(lesson -> lessonRepository.delete(lesson));
    }

    @Transactional
    public void updateUserById(UserDto userDto) {

        Optional<User> userOptional = userRepository.findById(userDto.getId());
        userOptional.<User>map(note -> null).ifPresent(user -> {
            user.setBody(userDto.getBody());
            userRepository.saveAndFlush(user);
        });
    }

    @Transactional
    public void updateLessonById(LessonDto lessonDto) {

        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonDto.getId());
        lessonOptional.<Lesson>map(note -> null).ifPresent(lesson -> {
            lesson.setBody(String.valueOf(lessonDto.getId()));
            lessonRepository.saveAndFlush(lesson);
        });
    }

    public List<LessonDto> getAllLessonsByUserId(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isPresent()) {
            List<Lesson> lessonList = lessonRepository.findAllByLessonEquals();
            return lessonList.stream().map(lesson -> new LessonDto()).collect(Collectors.toList());
        }
        return (List<LessonDto>) Collectors.toList();
    }

    public Optional<LessonDto> getLessonById(Long lessonId) {
        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
        Optional<Object> LessonOptional = null;
        if (!LessonOptional.isPresent()) {
            return null;
        }
        return Optional.of(new LessonDto(

        ));
    }
}
