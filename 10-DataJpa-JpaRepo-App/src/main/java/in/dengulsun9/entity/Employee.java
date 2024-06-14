package in.dengulsun9.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender,dept;
	
	@CreationTimestamp
	@Column(name="date_created",updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="last_updated",insertable = false)
	private LocalDate lastUpdated;
	
}
