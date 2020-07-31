package com.train.dao;

import com.train.model.entity.Station;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface StationDao extends CrudRepository<Station,Long> {

    List<Station> findAll();

    Optional<Station> findById(Long id);

    Station findByName(String name);
}
