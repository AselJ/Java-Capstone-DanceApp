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

        private Long lessonId;

        private String lessonName;

        private String description;

        private UserDto userDto;

        public LessonDto(Lesson lesson)
        {
                if(lesson.getLessonId() != null){
                        this.lessonId = lesson.getLessonId();
                }
                if(lesson.getLessonName() != null){
                        this.lessonName = lesson.getLessonName();
                }
                if(lesson.getDescription() != null){
                        this.description = lesson.getDescription();
                }
        }
}


