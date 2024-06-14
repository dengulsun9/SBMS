package in.dengulsun9.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {

	public Chip() {
		// TODO Auto-generated constructor stub
		System.out.println("Chip:Constructor");
	}
	
	public String chipType()
	{
		return "32-Bit";
	}
	
}
