package in.dengulsun9;
 
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.dengulsun9.entity.Employee;
import in.dengulsun9.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct= SpringApplication.run(Application.class, args);
		
		EmployeeRepository repo = ct.getBean(EmployeeRepository.class);
		
//		Employee e1=new Employee(1, "John", 5000.00, "male", "Sales");
//		Employee e2=new Employee(2, "Killer", 4000.00, "male", "Admin");
//		Employee e3=new Employee(3, "Broke", 6000.00, "female", "Account");
//		Employee e4=new Employee(4, "Gulsan", 8000.00, "male", "Manager");
//		Employee e5=new Employee(5, "Kumari", 2000.00, "female", "marketing");
//		Employee e6=new Employee(6, "Samen", 8400.00, "female", "hr");
//		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
//		System.out.println("Record Inserted");
		
		
		
//		//Sorting
//		Sort sort = Sort.by("empSalary","empName").descending();
//		 List<Employee> all2 = repo.findAll(sort);
//		 all2.forEach(s->System.out.println(s));
//		
//		
//		 //Pagination
//		int pageNo=3;
//		
//		PageRequest page = PageRequest.of(pageNo-1, 2);
//		
//		Page<Employee> all = repo.findAll(page);
//		
//		all.forEach(s->System.out.println(s));
		
		
//		Employee e1=new Employee();
//		e1.setEmpGender("male");
//		e1.setDept("Admin");
//		
//		Example<Employee> of = Example.of(e1);
//		List<Employee> all = repo.findAll(of);
//		all.forEach(s->System.out.println(s));
		
		Employee e1=new Employee();
//		e1.setEmpId(102);
		e1.setEmpName("Raja");
		e1.setEmpGender("male");
		e1.setDept("hr");
		
		 Employee save = repo.save(e1);
		 
		 System.out.println("Record Inserted....");
		
	}

}
