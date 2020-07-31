package com.train.dao;

import com.train.model.entity.Passenger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PassengerDao extends CrudRepository<Passenger,Long> {

    List<Passenger> findAll();

    Optional<Passenger> findById (Long id);

}
