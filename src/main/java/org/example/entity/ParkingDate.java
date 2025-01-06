package org.example.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ParkingDate {

    private LocalDate dateOfArrival;

    private LocalDate dateOfDeparture;

    public ParkingDate () {
    }


    public ParkingDate(LocalDate dateOfArrival, LocalDate dateOfDeparture) {
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

}
