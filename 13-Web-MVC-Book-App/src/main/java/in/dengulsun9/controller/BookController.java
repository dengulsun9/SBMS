package in.dengulsun9.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.dengulsun9.entity.Book;
import in.dengulsun9.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;

	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id)
	{
		
		System.out.println("id :: "+id);
		
		ModelAndView mav=new ModelAndView();
		
		Optional<Book> bi = repo.findById(id);
		if(bi.isPresent())
		{
			Book bo = bi.get();
			System.out.println(bi);
			mav.addObject("book", bo);
		}
		
		mav.setViewName("index");
		return mav;
		
	}
}
