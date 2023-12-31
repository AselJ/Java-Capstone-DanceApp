///package com.devmountain.DanceApp.services;

//import com.devmountain.DanceApp.dtos.LessonDto;
//import com.devmountain.DanceApp.dtos.RegistrationDto;
//import com.devmountain.DanceApp.dtos.UserDto;
//import com.devmountain.DanceApp.entities.Lesson;
//import com.devmountain.DanceApp.entities.Registration;
//import com.devmountain.DanceApp.entities.User;
//import com.devmountain.DanceApp.repositories.LessonRepository;
//import com.devmountain.DanceApp.repositories.RegistrationRepository;
//import com.devmountain.DanceApp.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//@Service
//public class RegistrationServiceImpl implements RegistrationService {
//    @Autowired
//    private RegistrationRepository registrationRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//    private User userId;
//
//    @Autowired
//    private LessonRepository lessonRepository;
//    private Lesson lessonId;
//
//    @Override
//    public List<RegistrationDto> getAllRegistration() {
//        List<Registration> registrationList = registrationRepository.findAll();
//        return registrationList.stream().map(registration -> new RegistrationDto(registration)).collect(Collectors.toList());
//    }
//    @Override
//    public void addRegistration(RegistrationDto registrationDto) {
//        Registration registration = new Registration(registrationDto);
//        registrationRepository.saveAndFlush(registration);
//    }
//
//    @Override
//    public void deleteRegistrationById(Long registrationId) {
//        Optional<Registration> registrationOptional = registrationRepository.findById(registrationId);
//        registrationOptional.ifPresent(registration -> registrationRepository.delete(registration));
//    }
//
//    @Override
//    public void updateRegistration(RegistrationDto registrationDto) {
//        Optional<Registration> registrationOptional = registrationRepository.findById(registrationDto.getId());
//        registrationOptional.ifPresent(registration -> {
//            registration.setRegistrationDate(registrationDto.getRegistrationDate());
//            registrationRepository.saveAndFlush(registration);
//        });
//
//    }
//
////    @Override
////    @Transactional
////    public List<String> addUser(UserDto userDto) {
////        List<String> response = new ArrayList<>();
////        User user = new User(userDto);
////        userRepository.saveAndFlush(user);
////        response.add("User Successfully Added");
////        return response;
////    }
////
////    @Override
////    public List<String> addLesson(LessonDto lessonDto) {
////        List<String> response = new ArrayList<>();
////        Lesson lesson = new Lesson(lessonDto);
////        lessonRepository.saveAndFlush(lesson);
////        response.add("Lesson Successfully Added");
////        return response;
////    }
////
////    public void deleteUserById(Long userId) {
////        Optional<User> userOptional = userRepository.findById(userId);
////        userOptional.ifPresent(user -> userRepository.delete(user));
////    }
////    @Transactional
////    public void deleteLessonById(Long lessonId) {
////        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
////        lessonOptional.ifPresent(lesson -> lessonRepository.delete(lesson));
////    }
////
////    @Transactional
////    public void updateUserById(UserDto userDto) {
////
////        Optional<User> userOptional = userRepository.findById(userDto.getId());
////        userOptional.<User>map(note -> null).ifPresent(user -> {
////
////            userRepository.saveAndFlush(user);
////        });
////    }
////
////    @Transactional
////    public void updateLessonById(LessonDto lessonDto) {
////
////        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonDto.getLessonId());
////        lessonOptional.<Lesson>map(note -> null).ifPresent(lesson -> {
////
////            lessonRepository.saveAndFlush(lesson);
////        });
////    }
////
////    public List<LessonDto> getAllLessonsByUserId(Long userId) {
////        Optional<User> userOptional = userRepository.findById(userId);
////        if(userOptional.isPresent()) {
////            List<Lesson> lessonList = lessonRepository.findAllByLessonEquals();
////            return lessonList.stream().map(lesson -> new LessonDto()).collect(Collectors.toList());
////        }
////        return (List<LessonDto>) Collectors.toList();
////    }
////
////    public Optional<LessonDto> getLessonById(Long lessonId) {
////        Optional<Lesson> lessonOptional = lessonRepository.findById(lessonId);
////        Optional<Object> LessonOptional = null;
////        if (!LessonOptional.isPresent()) {
////            return null;
////        }
////        return Optional.of(new LessonDto(
////
////        ));
////    }
////}
//}