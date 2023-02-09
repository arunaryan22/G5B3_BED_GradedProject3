package com.greatlearning.tickettracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.tickettracker.entities.TicketTracker;
import com.greatlearning.tickettracker.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}

	@Override
	public TicketTracker insertTicket(TicketTracker ticketTracker) {
		return ticketRepository.save(ticketTracker);
	}

	@Override
	public void deleteTicketById(int ticket_id) {
		ticketRepository.deleteById(ticket_id);

	}

	@Override
	public List<TicketTracker> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public TicketTracker getTicketById(int ticket_id) {
		return ticketRepository.findById(ticket_id).get();
	}

	@Override
	public TicketTracker updateTicket(TicketTracker tt) {
		return ticketRepository.save(tt);
	}

}
