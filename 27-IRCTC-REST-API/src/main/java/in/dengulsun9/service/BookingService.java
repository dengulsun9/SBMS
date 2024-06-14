package in.dengulsun9.service;

import in.dengulsun9.request.Passenger;
import in.dengulsun9.response.Ticket;

public interface BookingService {

	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
}
