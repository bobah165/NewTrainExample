package com.train.controller;

import com.train.model.dto.ScheduleDto;
import com.train.model.entity.Schedule;
import com.train.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/list")
    public String getAllSchedule(Model model) {
        List<Schedule> list = scheduleService.getAllSchedule();
        model.addAttribute("list", list);
        return "schedule/list";
    }

    @GetMapping("/add")
    public String getAddPage() {
        return "schedule/add";
    }

    @PostMapping("/add")
    public String addSchedule(ScheduleDto scheduleDto) {
        scheduleService.add(scheduleDto);
        return "redirect:/schedule/list";
    }
}
