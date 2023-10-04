package com.devmountain.DanceApp.entities;

import com.devmountain.DanceApp.dtos.RegistrationDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Registration")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Registration {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(columnDefinition = "date")
    private Date registrationDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;

    @ManyToOne
    @JoinColumn(name = "lessonId")
    Lesson lesson;

    public Registration(RegistrationDto registrationDto) {
        if (registrationDto.getId() != null) {
            this.id = registrationDto.getId();
        }
        if (registrationDto.getUserId() != null) {
            this.id = registrationDto.getUserId();
        }
        if (registrationDto.getLessonId() != null) {
            this.id = registrationDto.getLessonId();
        }
        if (registrationDto.getRegistrationDate() != null) {
            this.registrationDate = registrationDto.getRegistrationDate();
        }
    }
}

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setDate(Date date) {
//        this.registrationDate = date;
//    }
//
//    public Registration(Long id, Date date) {
//        this.id = id;
//        User userId = new User();
//        this.user = userId;
//        Lesson lessonId;
//        lessonId = null;
//        this.lesson = lessonId;
//        this.registrationDate = date;
//    }
//}
