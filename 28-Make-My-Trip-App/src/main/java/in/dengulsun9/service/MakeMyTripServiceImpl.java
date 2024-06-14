package in.dengulsun9.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.dengulsun9.request.Passenger;
import in.dengulsun9.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService{

	
	private String BOOK_TICKET_URL="http://localhost:8080/ticket";
	
	private String GET_TICKET_URL="http://localhost:8080/ticket/{ticketNum}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		// TODO Auto-generated method stub
		
		/*
		 * RestTemplate rt=new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.postForEntity(BOOK_TICKET_URL,passenger , Ticket.class);
		 * 
		 * Ticket ticket = responseEntity.getBody();
		 */
		
		
		//get the instancee of web client(implementation class)
		WebClient webClient = WebClient.create();
		
		//send post req with passanger data and map response to ticket obj
		Ticket ticket = webClient.post()
								.uri(BOOK_TICKET_URL)
								.bodyValue(passenger)
								.retrieve()
								.bodyToMono(Ticket.class)
								.block();
					
		
		
		
		
		
		
		
		return ticket;
	}

	@Override
	public Ticket getTicketByNumber(Integer ticketNumber) {
		
		/*
		 * RestTemplate rt=new RestTemplate(); ResponseEntity<Ticket> entity =
		 * rt.getForEntity(GET_TICKET_URL, Ticket.class,ticketNumber); Ticket ticket =
		 * entity.getBody();
		 */
		
		//get the instancee of web client(implementation class)
		WebClient webClient = WebClient.create();
		
		//send get req and map response to ticket obj
		Ticket ticket =    webClient.get()
									.uri(GET_TICKET_URL,ticketNumber)
									.retrieve()
									.bodyToMono(Ticket.class)
									.block();  //sync call
							
		
		
		
		return ticket;
	}

}
