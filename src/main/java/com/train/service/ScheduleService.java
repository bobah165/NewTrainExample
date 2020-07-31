package com.train.service;

import com.train.dao.ScheduleDao;
import com.train.model.dto.ScheduleDto;
import com.train.model.entity.Schedule;
import com.train.util.mapperForDto.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleDao scheduleDao;

    @Autowired
    private ScheduleMapper scheduleMapper;

    public List<Schedule> getAllSchedule() {
        return scheduleDao.findAll();
    }

    public void add(ScheduleDto scheduleDto) {
        Schedule schedule = scheduleMapper.mapperDtoToEntity(scheduleDto);
        scheduleDao.save(schedule);
    }

}
