package com.devmountain.DanceApp.entities;


import com.devmountain.DanceApp.dtos.LessonDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "Lessons")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(columnDefinition = "text")
    private String lessonName;

    @Column(columnDefinition = "text")
    private String description;


    @OneToMany(mappedBy = "lesson")
    Set<Registration> registration;

    public Lesson(LessonDto lessonDto)
    {
        if(lessonDto.getLessonId() != null){
            this.lessonId = lessonDto.getLessonId();
        }
        if(lessonDto.getLessonName() != null){
            this.lessonName = lessonDto.getLessonName();
        }
        if(lessonDto.getDescription() != null){
            this.description = lessonDto.getDescription();
        }
    }

    }

//    public Long getId() {
//        return lessonId;
//    }
//
//    public void setId(Long id) {
//        this.lessonId = id;
//    }
//
//    public String getName() {
//        return lessonName;
//    }
//
//    public void setName(String name) {
//        this.lessonName = name;
//    }
//
//    public String getBody() {
//        return description;
//    }
//
////    public Lesson() {
////    }
//
//    public void setBody(String body) {
//        this.description = body;
//    }

//    public Lesson(Long id, String name, String body) {
//        this.lessonId = id;
//        this.lessonName = name;
//        this.description = body;
//    }
