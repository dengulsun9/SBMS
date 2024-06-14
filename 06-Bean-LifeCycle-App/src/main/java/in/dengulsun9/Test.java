package in.dengulsun9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
		UserDao b = ap.getBean(UserDao.class);
		b.getData();
		
		ConfigurableApplicationContext cac=(ConfigurableApplicationContext) ap;
		
		cac.close();
	}
}
