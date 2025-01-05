package org.example.parking;

import org.example.entity.ParkingPlace;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    private final List<ParkingPlace> parkingPlace = new ArrayList<>();

    public ParkingService() {
      parkingPlace.add(new ParkingPlace(true, 1, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 500));
        parkingPlace.add(new ParkingPlace(false, 2, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 1000) );
        parkingPlace.add(new ParkingPlace(true, 3, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5),609) );
        parkingPlace.add(new ParkingPlace(false, 4, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 600));
        parkingPlace.add(new ParkingPlace(false, 5, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 800));
        parkingPlace.add(new ParkingPlace(false, 6, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5),600));
        parkingPlace.add(new ParkingPlace(true, 7, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 600));
        parkingPlace.add(new ParkingPlace(true, 8, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 800));
        parkingPlace.add(new ParkingPlace(true, 9, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 900));
        parkingPlace.add(new ParkingPlace(true, 10, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 1500));
        parkingPlace.add(new ParkingPlace(true, 11, 3, LocalDate.of(2025, 2, 3),LocalDate.of(2025, 5,5), 1200));
    }

    public List<ParkingPlace> findAll() {return parkingPlace;}

    public ParkingPlace findById(int id) {return parkingPlace.get(id);}


}