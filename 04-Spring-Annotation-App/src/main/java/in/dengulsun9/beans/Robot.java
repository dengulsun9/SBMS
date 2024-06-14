package in.dengulsun9.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {

	@Autowired
	private Chip chip;
	
	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("Robot::Constructor");
	}
	
	public void doWork()
	{
		String type = chip.chipType();
		
		if(type.equals("32-Bit"))
		{
			System.out.println("Performance is slow");
		}
		
	}
	
}
