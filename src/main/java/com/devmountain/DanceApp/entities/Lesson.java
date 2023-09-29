package com.devmountain.DanceApp.entities;


import com.devmountain.DanceApp.dtos.LessonDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.servlet.Registration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Lessons")
@Data
@AllArgsConstructor

public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(columnDefinition = "text")
    private String lessonName;

    @Column(columnDefinition = "text")
    private String description;


    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
    @JoinTable
            (

            )
    @JsonBackReference
    private Registration registration;

    public Lesson(LessonDto lessonDto) {

    }

    public Long getId() {
        return lessonId;
    }

    public void setId(Long id) {
        this.lessonId = id;
    }

    public String getName() {
        return lessonName;
    }

    public void setName(String name) {
        this.lessonName = name;
    }

    public String getBody() {
        return description;
    }

    public Lesson() {
    }

    public void setBody(String body) {
        this.description = body;
    }

    public Lesson(Long id, String name, String body) {
        this.lessonId = id;
        this.lessonName = name;
        this.description = body;
    }
}