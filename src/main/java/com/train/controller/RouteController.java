package com.train.controller;

import com.train.model.entity.Route;
import com.train.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("route")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping("/list")
    public String getAllRoutes(Model model) {
        List<Route> routeList = routeService.getAllRoute();
        model.addAttribute("routeList",routeList);
        return "route/list";
    }

    @GetMapping("/add")
    public String getAddRoutePage() {
        return "route/add";
    }

    @PostMapping("/add")
    public String addRoute(Route route) {
        routeService.addRoute(route);
        return "redirect:/route/list";
    }
}
