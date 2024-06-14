package in.dengulsun9.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dengulsun9.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
