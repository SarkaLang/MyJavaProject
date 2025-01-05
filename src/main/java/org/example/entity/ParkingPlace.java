package org.example.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ParkingPlace {

    private boolean status;
    private int parkingNumber;

    private int numberOfFlour;

    private LocalDate dateOfArrival;

    private LocalDate dateOfDeparture;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ParkingPlace () {

    }

    public ParkingPlace(boolean status, int parkingNumber, int numberOfFlour, LocalDate dateOfArrival, LocalDate dateOfDeparture, int price) {
        this.status = status;
        this.parkingNumber = parkingNumber;
        this.numberOfFlour = numberOfFlour;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(int parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public int getNumberOfFlour() {
        return numberOfFlour;
    }

    public void setNumberOfFlour(int numberOfFlour) {
        this.numberOfFlour = numberOfFlour;
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
