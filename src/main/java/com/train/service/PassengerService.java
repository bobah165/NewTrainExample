package com.train.service;

import com.train.dao.PassengerDao;
import com.train.model.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerDao passengerDao;

    public List<Passenger> getPassengers() {
        return passengerDao.findAll();
    }

    public void addPassenger(Passenger passenger) {
        passengerDao.save(passenger);
    }
}
