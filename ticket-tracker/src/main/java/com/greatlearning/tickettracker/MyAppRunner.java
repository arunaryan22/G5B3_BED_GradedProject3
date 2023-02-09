package com.greatlearning.tickettracker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greatlearning.tickettracker.entities.TicketTracker;
import com.greatlearning.tickettracker.repositories.TicketRepository;

@Component
public class MyAppRunner implements CommandLineRunner {
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public void run(String... args) throws Exception {
/*
		TicketTracker tt1 = new TicketTracker();
		tt1.setTicket_title("movie");
		tt1.setTicket_desc("Movie_Name1");
		tt1.setTicket_content("This movie details not available");
		LocalDate date = LocalDate.now();
		tt1.setTicket_date(date);
		ticketRepository.save(tt1);  */

	}

}
