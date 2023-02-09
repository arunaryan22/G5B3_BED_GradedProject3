package com.greatlearning.tickettracker.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.tickettracker.entities.TicketTracker;
import com.greatlearning.tickettracker.services.TicketService;

@Controller
public class TicketController {
	private TicketService ticketService;

	public TicketController(TicketService ticketService) {
		super();
		this.ticketService = ticketService;
	}

	@GetMapping("/tickets")
	public String listTickets(Model model) {
		List<TicketTracker> ticketTracker = ticketService.getAllTickets();
		model.addAttribute("ticketTracker", ticketTracker);
		return "tickets";
	}

	@GetMapping("/tickets/{ticket_id}")
	public String deleteTickets(@PathVariable("ticket_id") int ticket_id) {
		ticketService.deleteTicketById(ticket_id);
		return "redirect:/tickets";
	}

	@GetMapping("/tickets/new")
	public String createTicketForm(Model model) {
		TicketTracker ticketTracker = new TicketTracker();
		model.addAttribute("ticketTracker", ticketTracker);
		return "create_tickets";
	}

	@PostMapping("/tickets")
	public String saveTicket(@ModelAttribute("ticketTracker") TicketTracker theTicketTracker) {
		ticketService.insertTicket(theTicketTracker);
		return "redirect:/tickets";
	}

	@GetMapping("/tickets/edit/{ticket_id}")
	public String editTicketForm(@PathVariable("ticket_id") int ticket_id, Model model) {
		TicketTracker ticketTracker = ticketService.getTicketById(ticket_id);
		model.addAttribute("ticketTracker", ticketTracker);
		return "edit_ticket";
	}

	@GetMapping("/tickets/view/{ticket_id}")
	public String viewTicketForm(@PathVariable("ticket_id") int ticket_id, Model model) {
		TicketTracker ticketTracker = ticketService.getTicketById(ticket_id);
		model.addAttribute("ticketTracker", ticketTracker);
		return "ticket_view";
	}

	@PostMapping("/tickets/{ticket_id}")
	public String updateTicket(@PathVariable("ticket_id") int ticket_id,
			@ModelAttribute("ticketTracker") TicketTracker theTicketTracker) {
		TicketTracker existingTicket = ticketService.getTicketById(ticket_id);
		existingTicket.setTicket_title(theTicketTracker.getTicket_title());
		existingTicket.setTicket_desc(theTicketTracker.getTicket_desc());
		existingTicket.setTicket_date(theTicketTracker.getTicket_date());
		existingTicket.setTicket_content(theTicketTracker.getTicket_content());
		ticketService.insertTicket(existingTicket);
		return "redirect:/tickets";
	}

}
