package in.dengulsun9.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dengulsun9.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	}
	
}
