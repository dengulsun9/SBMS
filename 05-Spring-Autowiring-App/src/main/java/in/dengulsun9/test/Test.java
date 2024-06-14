package in.dengulsun9.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.dengulsun9.AppConfig;
import in.dengulsun9.beans.ReportService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = ap.getBean(ReportService.class);
		service.generateReport();
		
	}
}
