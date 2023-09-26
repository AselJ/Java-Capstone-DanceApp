package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Lesson;
import com.devmountain.DanceApp.entities.Registration;
import com.devmountain.DanceApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationRepository extends JpaRepository<Registration, Long> {

    public void saveAndFlush(Registration registration) {

    }

    public Optional<Registration> findById(Long registrationId) {
        return Optional.empty();
    }

    public void delete(Registration registration) {

    }

    public List<Registration> findAllByRegistrationEquals(Registration registration) {
        return new ArrayList<>();
    }


}

