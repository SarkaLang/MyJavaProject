package org.example.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ParkingPlace {

    private boolean status;
    private int parkingNumber;

    private int numberOfFlour;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ParkingPlace () {

    }

    public ParkingPlace(boolean status, int parkingNumber, int numberOfFlour, int price) {
        this.status = status;
        this.parkingNumber = parkingNumber;
        this.numberOfFlour = numberOfFlour;
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

}
