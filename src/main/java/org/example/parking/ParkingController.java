package org.example.parking;

import jakarta.validation.Valid;
import org.example.entity.ParkingDate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@Validated
@Controller
public class ParkingController {

    private final ParkingService service;

    public ParkingController(ParkingService service) {this.service = service;}

    @GetMapping("/")
    public ModelAndView mainPaige(@Valid @ModelAttribute ParkingDate parkingDate, BindingResult bindingResult) {

        ModelAndView result = new ModelAndView("index");

        String dateOfArrival = parkingDate.getDateOfArrival() != null ? parkingDate.getDateOfArrival().toString() : String.valueOf(LocalDate.now());
        String dateOfDeparture = parkingDate.getDateOfDeparture() != null ? parkingDate.getDateOfDeparture().toString() : String.valueOf(LocalDate.now());

        result.addObject("dateOfArrival", dateOfArrival);
        result.addObject("dateOfDeparture", dateOfDeparture);

         long numberOfDays = service.getNumberOfDays(dateOfArrival, dateOfDeparture);
         result.addObject("parkingDate", numberOfDays);

       if (numberOfDays > 0) {
            result.addObject("parkingPlace", service.findAll());
        }

        return result;
    }

    @GetMapping("/login")
    public ModelAndView loginPage() {
        return new ModelAndView("login");
    }

    @GetMapping("/{id}")
    public ModelAndView parkingPlaceID(@PathVariable int id, @RequestParam(value = "dateOfArrival", required = false) String dateOfArrivalStr, @RequestParam(value = "dateOfDeparture", required = false) String dateOfDepartureStr) {
        ModelAndView detail =  new ModelAndView("placeID");
        detail.addObject("placeID", service.findById(id));
        detail.addObject("parkingPlace", service.findById(id));
        detail.addObject("dateOfArrival", dateOfArrivalStr);
        detail.addObject("dateOfDeparture", dateOfDepartureStr);
        return detail;
    }
}
