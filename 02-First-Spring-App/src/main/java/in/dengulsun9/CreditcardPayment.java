package in.dengulsun9;

public class CreditcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		//Logic for Credit card payment
		return "Payment sucessfull through credit card";
	}

}
