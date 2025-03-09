package com.personal.cinema_reservation_system.repositories;

import com.personal.cinema_reservation_system.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
