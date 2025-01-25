package org.example.parking;

import org.example.entity.ParkingPlace;
import org.example.entity.ParkingDate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    private final List<ParkingPlace> parkingPlace = new ArrayList<>();

    public ParkingService() {
      parkingPlace.add(new ParkingPlace(true, 1, 3, 250, 0));
        parkingPlace.add(new ParkingPlace(false, 2, 3, 200, 0) );
        parkingPlace.add(new ParkingPlace(true, 3, 3,170, 0) );
        parkingPlace.add(new ParkingPlace(false, 4, 3,  350, 0));
        parkingPlace.add(new ParkingPlace(false, 5, 3, 200, 0));
        parkingPlace.add(new ParkingPlace(false, 6, 3, 220, 0));
        parkingPlace.add(new ParkingPlace(true, 7, 3, 199, 0));
        parkingPlace.add(new ParkingPlace(true, 8, 3,  201, 0));
        parkingPlace.add(new ParkingPlace(true, 9, 3,  185, 0));
        parkingPlace.add(new ParkingPlace(true, 10, 3,  210, 0));
        parkingPlace.add(new ParkingPlace(true, 11, 3,  350, 0));
    }

    public List<ParkingPlace> findAll() {return parkingPlace;}

    public ParkingPlace findById(int id) {return parkingPlace.get(id);}

    public long getNumberOfDays(String dateOfArrivalStr, String dateOfDepartureStr) {
        if (dateOfArrivalStr != null && dateOfDepartureStr != null) {
            LocalDate dateOfArrival = LocalDate.parse(dateOfArrivalStr);
            LocalDate dateOfDeparture = LocalDate.parse(dateOfDepartureStr);

            ParkingDate parkingDate = new ParkingDate(dateOfArrival, dateOfDeparture);
            return ChronoUnit.DAYS.between(parkingDate.getDateOfArrival(), parkingDate.getDateOfDeparture());
        } else {
            return 0;
        }
    }

    public int getPrice(ParkingPlace place, long numberOfDays) {
        return (int) (place.getPrice() * numberOfDays);
    }

}