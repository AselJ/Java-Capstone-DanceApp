package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class LessonRepository implements JpaRepository<Lesson, Long> {

    public static List<?> findByAttribute() {
        List<?>o = null;
        return o;
    }

    public Optional<Lesson> findById(Long lessonId) {
        return Optional.empty();
    }

    public void delete(Lesson lesson) {

    }

    public List<Lesson> findAllByLessonEquals() {
        return new ArrayList<>();
    }

    public List<Lesson> findAllByLessonsEquals(User user) {
        List<Lesson> lessonList = null;
        return lessonList;
    }
}
