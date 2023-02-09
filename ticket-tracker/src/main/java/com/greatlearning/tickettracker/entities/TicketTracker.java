package com.greatlearning.tickettracker.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_tracker")
public class TicketTracker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticket_id;
	@Column(name = "ticket_title", nullable = false)
	private String ticket_title;
	@Column(name = "ticket_desc")
	private String ticket_desc;
	@Column(name = "ticket_content")
	private String ticket_content;
	private LocalDate ticket_date = LocalDate.now();

	public TicketTracker() {

	}

	public TicketTracker(String ticket_title, String ticket_desc, String ticket_content, LocalDate ticket_date) {

		this.ticket_title = ticket_title;
		this.ticket_desc = ticket_desc;
		this.ticket_content = ticket_content;
		this.ticket_date = ticket_date;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getTicket_title() {
		return ticket_title;
	}

	public void setTicket_title(String ticket_title) {
		this.ticket_title = ticket_title;
	}

	public String getTicket_desc() {
		return ticket_desc;
	}

	public void setTicket_desc(String ticket_desc) {
		this.ticket_desc = ticket_desc;
	}

	public LocalDate getTicket_date() {
		return ticket_date;
	}

	public void setTicket_date(LocalDate ticket_date) {
		this.ticket_date = ticket_date;
	}

	public String getTicket_content() {
		return ticket_content;
	}

	public void setTicket_content(String ticket_content) {
		this.ticket_content = ticket_content;
	}

}
