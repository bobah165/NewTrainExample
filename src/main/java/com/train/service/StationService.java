package com.train.service;

import com.train.dao.StationDao;
import com.train.model.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationDao stationDao;

    public void addStation(Station station) {
        stationDao.save(station);
    }

    public List<Station> getAllStation() {
        return stationDao.findAll();
    }

    public Station getById (Long id) {
        return stationDao.findById(id).get();
    }

    public Station getByName(String name) {return stationDao.findByName(name);}
}
