package in.dengulsun9.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.dengulsun9.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	public List<Book> findByBookPriceGreaterThan(Double price);
	
	public List<Book> findByBookPriceLessThan(Double price);
	
	public List<Book> findByBookName(String name);
	
	@Query(value = "select * from book",nativeQuery = true)
	public List<Book> getAllBooks();
	
	
	@Query("from Book")
	public List<Book> getBooks();
}
