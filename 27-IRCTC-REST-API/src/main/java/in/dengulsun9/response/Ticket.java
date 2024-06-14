package in.dengulsun9.response;

import lombok.Data;

@Data
public class Ticket {

	private Integer ticketNum;
	private String status;
	private Double ticketCost;
	private String name,from,to,doj,trainNumber;
}
