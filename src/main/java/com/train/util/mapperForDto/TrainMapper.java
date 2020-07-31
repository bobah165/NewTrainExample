package com.train.util.mapperForDto;

import com.train.model.dto.TrainInformation;
import com.train.model.entity.Train;
import org.springframework.stereotype.Component;

@Component
public class TrainMapper {

    public TrainInformation mapperFromTrainToInformation(Train train) {
        TrainInformation trainInformation = new TrainInformation();

        trainInformation.setId(train.getId());
        trainInformation.setNumber(train.getNumberTrain());

        train.getRoute()
             .getSchedules()
             .forEach(schedule -> {
                 trainInformation.setStations(schedule.getStation().getName());
             });

        return trainInformation;
    }
}
