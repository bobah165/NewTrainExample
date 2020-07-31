package com.train.dao;

import com.train.model.entity.Schedule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ScheduleDao extends CrudRepository<Schedule,Long> {

    List<Schedule> findAll();

    Optional<Schedule> findById (Long id);

}
