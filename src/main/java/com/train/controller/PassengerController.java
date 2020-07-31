package com.train.controller;

import com.train.model.entity.Passenger;
import com.train.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pass")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/list")
    public String getAllPassengers(Model model) {
        List<Passenger> passengerList = passengerService.getPassengers();
        model.addAttribute("passList",passengerList);
        return "passenger/list";
    }

    @GetMapping("/add")
    public String getAddPassengerPage() {
        return "passenger/add";
    }

    @PostMapping("/add")
    public String addPassenger(Passenger passenger) {
        passengerService.addPassenger(passenger);
        return "redirect:/pass/list";
    }

}
