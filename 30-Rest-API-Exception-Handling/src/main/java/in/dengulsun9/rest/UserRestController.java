package in.dengulsun9.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.dengulsun9.exception.UserNotFoundException;

@RestController
public class UserRestController {

	
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable Integer userId) throws Exception
	{
		if(userId==100)
		{
			return "john";
		}
		else if(userId==200)
		{
			return "Smith";
		}
		else
		{
			throw new UserNotFoundException("User Not Found");
		}
		
		
	}
	
}
