package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LessonRepository extends JpaRepository<Lesson, Long> {
    public void saveAndFlush(Lesson lesson) {

    }

    public Optional<Lesson> findById(Long lessonId) {
        return Optional.empty();
    }

    public void delete(Lesson lesson) {

    }

    public List<Lesson> findAllByLessonEquals(Lesson lesson) {
        return new ArrayList<>();
    }
}
