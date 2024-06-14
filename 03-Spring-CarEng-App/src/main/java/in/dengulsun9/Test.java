package in.dengulsun9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		Car c1 = ac.getBean(Car.class);
		c1.drive();
		System.out.println(c1.hashCode());

		Car c2 = ac.getBean(Car.class);
		System.out.println(c2.hashCode());

		Car c3 = ac.getBean(Car.class);
		System.out.println(c3.hashCode());
	}
}
