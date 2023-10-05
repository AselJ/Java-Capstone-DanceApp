package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.dtos.LessonDto;
import com.devmountain.DanceApp.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {
    @Autowired
    public LessonService lessonService;

    @GetMapping("/all")
    public List<LessonDto> getAllLesson()
    {
        return lessonService.getAllLesson();
    }

    @PostMapping("/add")
    public void addLesson(@RequestBody LessonDto lessonDto)
    {
        lessonService.addLesson(lessonDto);
    }

    @DeleteMapping("/delete/{lessonId}")
    public void deleteLessonById(@PathVariable Long lessonId)
    {
        lessonService.deleteLessonById(lessonId);
    }

    @PutMapping("/update")
    public void updateLesson(@RequestBody LessonDto lessonDto)
    {
        lessonService.updateLesson(lessonDto);
    }


//    public String getLesson(Model model) {
//        Model lessons;
//        SimpleJpaRepository<Object, Object> LessonRepository;
//        lessons = model.addAttribute("lessons", Collections.unmodifiableList(com.devmountain.DanceApp.repositories.LessonRepository.findById()));
//
//        return "lessons";
//
//    }
}

