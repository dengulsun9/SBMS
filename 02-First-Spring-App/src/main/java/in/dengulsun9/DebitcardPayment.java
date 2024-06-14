package in.dengulsun9;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for debit card payment
		return "payment succesfull through debit card";
	}

}
