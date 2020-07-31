package com.train.controller;

import com.train.model.entity.Ticket;
import com.train.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/list")
    public String getAllTickets(Model model) {
        List<Ticket> tickets = ticketService.getAllTicket();
        model.addAttribute("tickets",tickets);
        return "ticket/list";
    }

    @GetMapping("/add")
    public String getAddTicketPage() {
        return "ticket/add";
    }

    @PostMapping("/add")
    public String addTicket(Ticket ticket) {
        ticketService.addTicket(ticket);
        return "redirect:/ticket/list";
    }
}
