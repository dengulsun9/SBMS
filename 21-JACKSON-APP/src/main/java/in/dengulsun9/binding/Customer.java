package in.dengulsun9.binding;

import lombok.Data;

@Data
public class Customer {

	private Integer id;
	private String name,email;
	private Long phno;
	private Address addr;
	
}
