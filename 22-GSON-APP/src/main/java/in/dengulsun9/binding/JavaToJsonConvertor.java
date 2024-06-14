package in.dengulsun9.binding;

import java.io.FileWriter;

import com.google.gson.Gson;

public class JavaToJsonConvertor {

	public static void main(String[] args){
		
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
		
		Gson g=new Gson();
//		g.toJson(c, new FileWriter("customer.json"));
//		System.out.println("File Created");
		
		 try (FileWriter writer = new FileWriter("customer.json")) {
	            g.toJson(c, writer);
	            System.out.println("JSON file created successfully with data.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
}
