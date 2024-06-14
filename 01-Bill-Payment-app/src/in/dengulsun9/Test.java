package in.dengulsun9;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		BillCollector bc = new BillCollector();

		// injecting creditcard obj into billcollector(setter injection)
		bc.setPayment(new CreditcardPayment());
		bc.collectPayment(1500.00);

		// injecting creditcard obj into billcollector(Constructor injection)
		BillCollector bc1 = new BillCollector(new DebitcardPayment());
		bc1.collectPayment(1500.00);

		// injecting creditcard obj into billcollector(field injection)through
		// reflection api
		Class<?> clz = Class.forName("in.dengulsun9.BillCollector");

		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);

		Object obj = clz.getDeclaredConstructor().newInstance();
		field.set(obj, new UpiPayment()); // injecting value to variable

		BillCollector bcc = (BillCollector) obj;
		bcc.collectPayment(2000);
	}

}
