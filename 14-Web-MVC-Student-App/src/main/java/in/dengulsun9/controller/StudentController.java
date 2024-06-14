package in.dengulsun9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import in.dengulsun9.binding.Student;
import in.dengulsun9.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		 
		init(model);
		
		
		return "index";
	}


	
	private void init(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("preftiming", service.getTimings());
	}
	
	
	@PostMapping("/save")
	public String handleSubmitButton(Student s,Model model)
	{
		
		boolean isSaved = service.saveStudent(s);
		if(isSaved)
		{
			model.addAttribute("msg","Data Saved..");
			
		}
		
		
		 
		init(model);
		
		return "index";
	}
}
