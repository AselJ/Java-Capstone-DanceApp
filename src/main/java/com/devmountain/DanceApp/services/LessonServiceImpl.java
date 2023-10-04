package com.devmountain.DanceApp.services;

import com.devmountain.DanceApp.dtos.LessonDto;
//import com.devmountain.DanceApp.dtos.UserDto;
import com.devmountain.DanceApp.entities.Lesson;
//import com.devmountain.DanceApp.entities.User;
import com.devmountain.DanceApp.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public List<LessonDto> getAllLesson() {
        List<Lesson> lessonList = lessonRepository.findAll();
        return lessonList.stream().map(lesson -> new LessonDto(lesson)).collect(Collectors.toList());

    }

    @Override
    public void addLesson(LessonDto lessonDto) {
        Lesson lesson = new Lesson(lessonDto);
        lessonRepository.saveAndFlush(lesson);
    }

    @Override
    public void deleteLessonById(Long lessonId) {
        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
        lessonOptional.ifPresent(lesson -> lessonRepository.delete(lesson));

    }

    @Override
    public void updateLesson(LessonDto lessonDto) {
        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonDto.getLessonId());
        lessonOptional.ifPresent(lesson -> {
            lesson.setLessonName(lessonDto.getLessonName());
            lesson.setDescription(lessonDto.getDescription());
            lessonRepository.saveAndFlush(lesson);
        });
    }
}
