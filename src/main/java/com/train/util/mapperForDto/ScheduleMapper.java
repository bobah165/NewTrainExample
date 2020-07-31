package com.train.util.mapperForDto;

import com.train.model.dto.ScheduleDto;
import com.train.model.entity.Schedule;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class ScheduleMapper {

    public Schedule mapperDtoToEntity(ScheduleDto scheduleDto) {
        Schedule schedule = new Schedule();
        schedule.setId(scheduleDto.getId());
        schedule.setArrivalTime(Time.valueOf(scheduleDto.getArrivalTime()+":00"));
        schedule.setDepartureTime(Time.valueOf(scheduleDto.getDepartureTime()+":00"));
        schedule.setStation(scheduleDto.getStation());
        schedule.setRoute(scheduleDto.getRoute());
        return schedule;
    }

    public ScheduleDto mapperEntityToDto(Schedule schedule) {
        ScheduleDto scheduleDto = new ScheduleDto();
        scheduleDto.setId(schedule.getId());
        scheduleDto.setArrivalTime(schedule.getArrivalTime().toString());
        scheduleDto.setDepartureTime(schedule.getDepartureTime().toString());
        scheduleDto.setStation(schedule.getStation());
        scheduleDto.setRoute(schedule.getRoute());
        return scheduleDto;
    }
}
