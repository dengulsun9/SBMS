package in.dengulsun9.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import in.dengulsun9.request.Passenger;
import in.dengulsun9.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService{

	private Map<Integer,Ticket> ticketsMap=new HashMap<>();
	private Integer ticketNum =1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
	
		//logic
		
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.0);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		
		ticketsMap.put(ticketNum, t);
		ticketNum++;
		
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(ticketsMap.containsKey(ticketNumber))
		{
			return ticketsMap.get(ticketNumber);
		}
		
		return null;
	}

}
