package com.devmountain.DanceApp.repositories;

import com.devmountain.DanceApp.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devmountain.DanceApp.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    static void saveAndFlush(Registration user) {

    }
    //public Optional<User> findByUserId(String username);
}
