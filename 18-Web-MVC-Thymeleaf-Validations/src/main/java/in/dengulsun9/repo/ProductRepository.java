package in.dengulsun9.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dengulsun9.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
