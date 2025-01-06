package org.example.parking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;


@Controller
public class ParkingController {

    private final ParkingService service;

    public ParkingController(ParkingService service) {this.service = service;}

    @GetMapping("/")
    public ModelAndView mainPaige(@RequestParam(value = "dateOfArrival", required = false) String dateOfArrivalStr, @RequestParam(value = "dateOfDeparture", required = false) String dateOfDepartureStr) {

        ModelAndView result = new ModelAndView("index");

        result.addObject("dateOfArrival", dateOfArrivalStr != null ? dateOfArrivalStr : "");
        result.addObject("dateOfDeparture", dateOfDepartureStr != null ? dateOfDepartureStr : "");

        result.addObject("parkingPlace", service.findAll());

         long numberOfDays = service.getNumberOfDays(dateOfArrivalStr, dateOfDepartureStr);
         result.addObject("parkingDate", numberOfDays);

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
