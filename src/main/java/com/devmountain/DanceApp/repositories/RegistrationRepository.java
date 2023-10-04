package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
//        public default Object saveAndFlush() {
//            return saveAndFlush(null);
//        }
//
//        @Override
//        public default Optional<Registration> findById(Long registrationId) {
//            return Optional.empty();
//        }
//
//        @Override
//        public default void delete(Registration registration) {
//
//        }
//        public default List<Registration> findAllByRegistrationEquals(Registration registration) {
//            return new ArrayList<>();
//        }


