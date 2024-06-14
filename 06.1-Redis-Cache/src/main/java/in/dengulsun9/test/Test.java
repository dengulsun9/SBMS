package in.dengulsun9.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dengulsun9.AppConfig;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ct=new AnnotationConfigApplicationContext(AppConfig.class);
		 
	}

}
