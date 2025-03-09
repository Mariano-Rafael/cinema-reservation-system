package com.personal.cinema_reservation_system.repositories;

import com.personal.cinema_reservation_system.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
