package org.example.parking;

import org.example.entity.ParkingPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface parkingRepository extends JpaRepository<ParkingPlace, Long> {

}
