package com.train.dao;


import com.train.model.entity.Route;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RouteDao extends CrudRepository<Route,Long> {

    List<Route> findAll();

    Optional<Route> findById (Long id);

}
