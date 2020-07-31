package com.train.controller;

import com.train.model.dto.TrainInformation;
import com.train.model.entity.Train;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class TrainRestController {

    @Autowired
    private TrainService trainService;

    @GetMapping("/list")
    public List<Train> trainList () {
        return trainService.getAllTrain();

    }

    @GetMapping("/find")
    public TrainInformation findTrainsByStationName () {
        List<TrainInformation> trains = trainService.findTrainByStation("SPb");
        return trains.get(0);
    }
}
