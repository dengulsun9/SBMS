package in.dengulsun9.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import in.dengulsun9.binding.Student;
import in.dengulsun9.entity.StudentEntity;
import in.dengulsun9.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	
	public boolean saveStudent(Student student)
	{
		System.out.println(student);
		
		StudentEntity entity=new StudentEntity(); 
		
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		System.out.println(entity);
		
		repo.save(entity); 
		
		return true;
		
	}

	public List<String> getCourses()
	{
		return Arrays.asList("Java","Python","DevOps","Aws");
	}

	public List<String> getTimings()
	{
		return Arrays.asList("Morning","Afternoon","Evening");
	}
	
	
	
}
