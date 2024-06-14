package in.dengulsun9.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestCntroller {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String msg="Welcome to Rest API....!!";
		
		int i=10/0;
		
		return msg;
	}
}
