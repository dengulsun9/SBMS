package in.dengulsun9.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {

	public static void main(String[] args) throws Exception {
		
		Address addr=new Address();
		addr.setState("TG");
		addr.setCity("Hyd");
		addr.setCountry("India");
		
		
		Customer c=new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("robert@gmail.com");
		c.setPhno((long) 764131321);
		c.setAddr(addr);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("Json file Created");
	}
	
}
