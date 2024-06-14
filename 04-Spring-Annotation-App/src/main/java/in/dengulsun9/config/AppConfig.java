package in.dengulsun9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.dengulsun9.beans.Engine;

@Configuration
@ComponentScan(basePackages = "in.dengulsun9")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");	// TODO Auto-generated constructor stub
	}
	
	@Bean
	public Engine getEngine()
	{
		Engine e=new Engine();
		return e;
	}
	
}
