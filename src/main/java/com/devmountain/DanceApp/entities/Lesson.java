package com.devmountain.DanceApp.entities;


import jakarta.persistence.*;

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