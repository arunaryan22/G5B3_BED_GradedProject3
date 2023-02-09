package com.greatlearning.tickettracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.tickettracker.entities.TicketTracker;

public interface TicketRepository extends JpaRepository<TicketTracker, Integer> {

}
