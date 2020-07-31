package com.train.controller;

import com.train.model.entity.Station;
import com.train.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/station")
public class StationController {

    @Autowired
    private StationService stationService;

    @GetMapping("/list")
    public String getAllStation(Model model) {
        List<Station> stations = stationService.getAllStation();
        model.addAttribute("stationList",stations);
        return "station/list";
    }

    @GetMapping("/add")
    public String getAddPage() {
        return "station/add";
    }

    @PostMapping("/add")
    public String addStation (Station station) {
        stationService.addStation(station);
        return "redirect:/station/list";
    }
}
