package in.dengulsun9.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private Integer personid;
	private String personName,gender;
	private Long phno;
	private Date dob;

}
