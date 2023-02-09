package com.greatlearning.tickettracker.services;

import java.util.List;

import com.greatlearning.tickettracker.entities.TicketTracker;

public interface TicketService {

	TicketTracker insertTicket(TicketTracker ticketTracker);

	void deleteTicketById(int ticket_id);

	List<TicketTracker> getAllTickets();

	TicketTracker getTicketById(int ticket_id);

	TicketTracker updateTicket(TicketTracker tt);

}
