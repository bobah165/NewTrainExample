package com.train.controller;


import com.train.model.entity.Train;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping("/list")
    public String trainList (Model model) {
        List<Train> trainList = trainService.getAllTrain();
        model.addAttribute("trains", trainList);
        return "train/list";
    }

    @GetMapping("/add")
    public String getPageAddTrain () {
        return "train/add";
    }

    @PostMapping("/add")
    public String addTrain (Train train) {
        trainService.addTrain(train);
        return "redirect:/train/list";
    }

    @GetMapping("/search")
    public String getSearchPage() {
        return "train/search";
    }

//    @GetMapping("/find")
//    @ResponseBody
//    public List<TrainInformation> findTrainsByStationName (@RequestParam("stationName") String stationName) {
//        List<TrainInformation> trains = trainService.findTrainByStation(stationName);
//        return trains;
//    }
}
