package in.dengulsun9;

public class BillCollector {

	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public BillCollector() {
		// TODO Auto-generated constructor stub
	}

	public BillCollector(IPayment payment) {
		// TODO Auto-generated constructor stub
		this.payment = payment;
	}

	public void  collectPayment(double amount) {
		String status = payment.pay(amount);

		System.out.println(status);
	}

}
