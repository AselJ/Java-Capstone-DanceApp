package com.devmountain.DanceApp.dtos;

import com.devmountain.DanceApp.entities.Registration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto implements Serializable {

        private Long id;

        private Long userId;

        private Long lessonId;

        private Date registrationDate;


        private UserDto userDto;

        private LessonDto lessonDto;

        public RegistrationDto(Registration registration){

            if(registration.getId() != null){
                this.id = registration.getId();
            }
            if(registration.getUserId() != null){
                this.id = registration.getUserId();
            }
            if(registration.getLessonId() != null){
                this.id = registration.getLessonId();
            }
            if(registration.getRegistrationDate() != null){
                this.registrationDate = registration.getRegistrationDate();
            }
        }
    }





