package com.personal.cinema_reservation_system.repositories;

import com.personal.cinema_reservation_system.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByReservation(Long reservationId);
}
