package model;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		
		return 0;
	}

	@Override
	public double interest(double amount, Integer mounths) {
		
		return 0;
	}
		
}
