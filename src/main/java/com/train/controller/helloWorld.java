package com.train.controller;


import com.train.model.entity.Train;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class helloWorld {

    @Autowired
    private TrainService trainService;


    @GetMapping("/list")
    public String trainList (Model model) {
        List<Train> trainList = trainService.getAllTrain();
        model.addAttribute("trains", trainList);
        return "train/list";
    }


    @GetMapping("/")
    public String getAddTrain () {
        return "train/add";
    }

}
