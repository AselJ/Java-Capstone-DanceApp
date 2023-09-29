package com.devmountain.DanceApp.controllers;

import com.devmountain.DanceApp.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {

    private final LessonRepository lessonRepository;

    public LessonController(LessonRepository lessonRepository){
        this.lessonRepository = lessonRepository;
    }
    public String getlessons(Model model) {
        Model lessons;
        lessons = model.addAttribute("lessons", Collections.unmodifiableList(LessonRepository.findByAttribute()));

        return "lessons";

    }
}

