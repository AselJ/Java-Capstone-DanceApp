package com.devmountain.DanceApp.dtos;


import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.Registration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto implements Serializable {

        private UserDto userDto;

        private LessonDto lessonDto;

        public RegistrationDto(Registration registration){

            if(registration.getId() != null){
                Long id = registration.getId();
            }
            if(registration.getRegistrationDate() != null){
                String registrationDate = String.valueOf(registration.getRegistrationDate());
            }
        }
    }





