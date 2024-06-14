package in.dengulsun9;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service 
public class UserService {

	public UserService()
	{
		System.out.println("Getting data from reddis");
	}
	
}
