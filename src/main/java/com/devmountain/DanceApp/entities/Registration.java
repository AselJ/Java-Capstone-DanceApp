package com.devmountain.DanceApp.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Table(name="Registration")
public class Registration {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Getter
    @Column(columnDefinition = "date")
    private Date registrationDate;

    //private<Set>

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.registrationDate = date;
    }

    public Registration() {
    }

    public Registration(Long id, Date date) {
        this.id = id;
        this.userId = id;
        this.lessonId = id;
        this.registrationDate = date;
    }
}
