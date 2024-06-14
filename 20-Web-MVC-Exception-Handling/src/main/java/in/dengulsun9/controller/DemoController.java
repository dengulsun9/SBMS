package in.dengulsun9.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	private Logger logger=LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/")
	public String getMsg(Model model)
	{
		String msgtxt="Good Evening";
		
		int i=10/0;
		
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
	@GetMapping("/wish")
	public String getWishMsg(Model model)
	{
		String msgtxt=null;
		msgtxt.length();
		
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model)
	{
		String msgtxt="Good Evening";
		
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
//	@ExceptionHandler(value= Exception.class)
//	public String handleAE(Exception ae)
//	{
//		String msg=ae.getMessage();
//		logger.error(msg);
//		return "errorPage";
//	}
}
