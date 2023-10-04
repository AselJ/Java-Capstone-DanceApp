package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    static void saveAndFlush(Registration lesson) {

    }
//    static List<Lesson> findById() {
//        return null;
//    }
//
//    List<Lesson> findAllByLessonEquals();

//    public static List<?> findByAttribute() {
//        List<?>o = null;
//        return o;
//    }
//
//    public Optional<Lesson> findById(Long lessonId) {
//        return Optional.empty();
//    }
//
//    public void delete(Lesson lesson) {
//
//    }
//
//    public List<Lesson> findAllByLessonEquals() {
//        return new ArrayList<>();
//    }
//
//    public List<Lesson> findAllByLessonsEquals(User user) {
//        List<Lesson> lessonList = null;
//        return lessonList;
//    }
}
