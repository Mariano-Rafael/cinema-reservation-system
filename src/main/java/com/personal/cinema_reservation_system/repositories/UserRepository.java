package com.personal.cinema_reservation_system.repositories;

import com.personal.cinema_reservation_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String email);
}
