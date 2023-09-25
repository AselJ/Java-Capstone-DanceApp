package com.devmountain.DanceApp.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.servlet.Registration;

@Entity
@Table(name="Lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(columnDefinition = "text")
    private String lessonName;

    @Column(columnDefinition = "text")
    private String description;

//    @ManyToMany
//    @JsonBackReference
//    private User user;

    @ManyToMany
    @JsonBackReference
    private Registration registration;

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