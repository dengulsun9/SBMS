package in.dengulsun9.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {

	private Integer id;
	private String name,email;
	private Long phno;
	
}
