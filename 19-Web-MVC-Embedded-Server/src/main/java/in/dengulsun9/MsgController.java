package in.dengulsun9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class MsgController {

	
	@GetMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("msg","Good Evening");
		return "index";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello()
	{
		String msg="hi,Hello How are you";
		return msg;
	}
}
