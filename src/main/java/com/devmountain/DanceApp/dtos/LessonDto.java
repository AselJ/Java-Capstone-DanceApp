package com.devmountain.DanceApp.dtos;

import com.devmountain.DanceApp.entities.Lesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonDto implements Serializable {
        private Long id;
        private String name;

        private String description;
        private UserDto userDto;

        public LessonDto(Lesson lesson){
            if(lesson.getId() != null){
                this.id = lesson.getId();
            }
            if(lesson.getName() != null){
                this.name = lesson.getName();
            }
        }
    }


