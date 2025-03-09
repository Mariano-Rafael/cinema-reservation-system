package com.personal.cinema_reservation_system.entities;

import com.personal.cinema_reservation_system.entities.enums.SeatStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    // atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String seatId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SeatStatus status = SeatStatus.AVAILABLE;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    // construtores

    public Seat() {
    }

    public Seat(String seatId, SeatStatus status, Reservation reservation) {
        this.seatId = seatId;
        this.status = status;
        this.reservation = reservation;
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
