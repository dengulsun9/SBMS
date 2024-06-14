package in.dengulsun9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	
	@GetMapping("/user")
	public String getWishMsg(Model model)
	{
		String msgtxt=null;
		msgtxt.length();
		
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
//	@ExceptionHandler(value= Exception.class)
//	public String handleAE(Exception ae)
//	{
//		String msg=ae.getMessage();
//		return "errorPage";
//	}
}
