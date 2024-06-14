package in.dengulsun9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dengulsun9.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
