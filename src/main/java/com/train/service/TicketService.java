package com.train.service;

import com.train.dao.TicketDao;
import com.train.model.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketDao ticketDao;

    public List<Ticket> getAllTicket() {
        return ticketDao.findAll();
    }

    public void addTicket(Ticket ticket) {
        ticketDao.save(ticket);
    }
}
