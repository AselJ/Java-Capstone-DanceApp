package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    public abstract class RegistrationRepository implements JpaRepository<Registration, Long> {

        public Object saveAndFlush() {
            return saveAndFlush(null);
        }

        @Override
        public Optional<Registration> findById(Long registrationId) {
            return Optional.empty();
        }
        
        @Override
        public void delete(Registration registration) {
    
        }
        public List<Registration> findAllByRegistrationEquals(Registration registration) {
            return new ArrayList<>();
        }
    }

