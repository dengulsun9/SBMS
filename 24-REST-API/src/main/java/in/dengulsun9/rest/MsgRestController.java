package in.dengulsun9.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

@RestController
public class MsgRestController {

	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg()
	{
		//Logic to save Msg
		
		String responseBody= "Msg Saved Succesfully";
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg()
	{
		String msg="Welcome to Rest API..";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		return "good evening";
	}
}
