package com.train.service;

import com.train.dao.TrainDao;
import com.train.model.dto.TrainInformation;
import com.train.model.entity.Train;
import com.train.util.mapperForDto.TrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainService {

    @Autowired
    private TrainDao trainDao;

    @Autowired
    private TrainMapper trainMapper;

    public Optional<Train> getTrainById (Long id) {
        return trainDao.findById(id);
    }

    public List<Train> getAllTrain() {
        return trainDao.findAll();
    }

    public void addTrain (Train train) {
        trainDao.save(train);
    }

    public List<TrainInformation> findTrainByStation (String stationName) {
            List<Train> trains = trainDao.findTrainByStationName(stationName);
            List<TrainInformation> trainInformations = new ArrayList<>();
            trains.forEach(train -> {
                TrainInformation trainInformation = trainMapper.mapperFromTrainToInformation(train);
                trainInformations.add(trainInformation);
            });
           return trainInformations;
    }

}
