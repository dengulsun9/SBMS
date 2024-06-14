package in.dengulsun9.binding;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class JsonToJavaConvertor {

	public static void main(String[] args) throws Exception {
		
		File f=new File("customer.json");
		
		Gson g=new Gson();
		 try (FileReader reader = new FileReader(f)) {
	            Customer fromJson = g.fromJson(reader, Customer.class);
	            System.out.println(fromJson);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
}
