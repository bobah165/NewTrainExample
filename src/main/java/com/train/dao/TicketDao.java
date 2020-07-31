package com.train.dao;

import com.train.model.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TicketDao extends CrudRepository<Ticket, Long> {
    List<Ticket> findAll();

    Optional<Ticket> findById(Long id);
}
