package com.train.model.dto;


import com.train.model.entity.Route;
import com.train.model.entity.Station;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto {
    private Long id;

    private Station station;

    private String arrivalTime;

    private String departureTime;

    private Route route;
}
