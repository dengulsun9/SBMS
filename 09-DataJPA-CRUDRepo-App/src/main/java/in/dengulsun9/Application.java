package in.dengulsun9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.dengulsun9.entity.Book;
import in.dengulsun9.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = SpringApplication.run(Application.class, args);

		BookRepository repo = ct.getBean(BookRepository.class);

//		Book b1=new Book();
//		b1.setBookId(103);
//		b1.setBookName("Angular");
//		b1.setBookPrice(2300.00);
//		
//		Book b2=new Book();
//		b2.setBookId(104);
//		b2.setBookName("MicroServices");
//		b2.setBookPrice(1500.00);
//		
//		repo.saveAll(Arrays.asList(b1,b2));
//		System.out.println("Record Inserted.....");

//		Optional<Book> id = repo.findById(101);
//		System.out.println(id.get());

//		boolean status = repo.existsById(105);
//		System.out.println("Record presense :: "+ status);

//		long count = repo.count();
//		System.out.println("Records Count :: "+count);

//		Optional<Book> bi = repo.findById(102);
//		
//		if(bi.isPresent())
//		{
//			System.out.println(bi.get());
//		}

//		Iterable<Book> aid = repo.findAllById(Arrays.asList(102,103,104));
//		
//		for(Book b:aid)
//		{
//			System.out.println(b);
//		}

//		Iterable<Book> aid = repo.findAll();
//
//		for (Book b : aid) {
//			System.out.println(b);
//		}

//		repo.deleteById(204);

//		Iterable<Book> all = repo.findAll();
//		for(Book b:all)
//		{
//			if(b.getBookPrice()>=2500.00)
//			{
//				System.out.println(b);
//			}
//		}

//		List<Book> fb = repo.findByBookPriceGreaterThan(2500.00);
//		for(Book b:fb)
//		{
//			System.out.println(b);
//		}
//		
//		List<Book> fb1 = repo.findByBookPriceLessThan(2500.00);
//		for(Book b:fb1)
//		{
//			System.out.println(b);
//		}
//		
//		List<Book> fb2 = repo.findByBookName("Spring");
//		for(Book b:fb2)
//		{
//			System.out.println(b);
//		}

//		List<Book> ab = repo.getAllBooks();
//		for(Book b:ab)
//		{
//			System.out.println(b);
//		}

		List<Book> ab = repo.getBooks();
		for (Book b : ab) {
			System.out.println(b);
		}
	}

}
