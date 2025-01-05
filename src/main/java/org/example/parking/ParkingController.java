package org.example.parking;

import org.example.entity.ParkingPlace;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ParkingController {

    private final ParkingService service;

    public ParkingController(ParkingService service) {this.service = service;}

    @GetMapping("/")
    public ModelAndView mainPaige() {
        ModelAndView result = new ModelAndView("index");
        result.addObject("parkingPlace", service.findAll());
        return result;
    }

    @GetMapping("/login")
    public ModelAndView loginPage() {
        return new ModelAndView("login");
    }

    @GetMapping("/{id}")
    public ModelAndView parkingPlaceID(@PathVariable int id) {
        ModelAndView detail =  new ModelAndView("placeID");
        detail.addObject("placeID", service.findById(id));
        return detail;
    }
}
