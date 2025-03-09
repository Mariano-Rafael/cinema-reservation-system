package com.personal.cinema_reservation_system.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reservations")
public class Reservation {

    // atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;

    @Column(nullable = false)
    private LocalDateTime reservationDate;

    @Column(nullable = false)
    private Integer quantitySeatsReserved;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<Seat> seatsReserved;

    // construtores

    public Reservation() {
    }

    public Reservation(User user, Movie movie, LocalDateTime reservationDate, Integer quantitySeatsReserved, List<Seat> seatsReserved) {
        this.user = user;
        this.movie = movie;
        this.reservationDate = reservationDate;
        this.quantitySeatsReserved = quantitySeatsReserved;
        this.seatsReserved = seatsReserved;
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Integer getQuantitySeatsReserved() {
        return quantitySeatsReserved;
    }

    public void setQuantitySeatsReserved(Integer quantitySeatsReserved) {
        this.quantitySeatsReserved = quantitySeatsReserved;
    }

    public List<Seat> getSeatsReserved() {
        return seatsReserved;
    }

    public void setSeatsReserved(List<Seat> seatsReserved) {
        this.seatsReserved = seatsReserved;
    }
}
