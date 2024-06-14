package in.dengulsun9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dengulsun9.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
