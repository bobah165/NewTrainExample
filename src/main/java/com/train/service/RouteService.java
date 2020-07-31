package com.train.service;

import com.train.dao.RouteDao;
import com.train.model.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteDao routeDao;

    public List<Route> getAllRoute() {
        return routeDao.findAll();
    }

    public void addRoute(Route route) {
        routeDao.save(route);
    }
}
