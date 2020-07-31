package com.train.dao;

import com.train.model.entity.Train;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TrainDao extends CrudRepository<Train, Long> {

    List<Train> findAll();

    Optional<Train> findById (Long id);

    @Query(value = "with " +
            "tab0 as (" +
                "select * " +
                "from station " +
                "where station_name = :stationName "+
                "), "+
            "tab as (" +
                "select * " +
                "from schedule " +
                "join tab0 using (id_station) "+
                "), " +
            "tab1 as (" +
                "select * " +
                "from route " +
                "join tab using (id_route) " +
                "), " +
            "tab2 as (" +
                "select * "+
                "from train " +
                "join tab1 using (id_route) " +
                ") " +
            "select * "+
            "from tab2",
            nativeQuery = true)
    List<Train> findTrainByStationName(@Param("stationName")String stationName);

}
