package entities.services;

public class PaypalService implements OnlinePaymentService {

	private static final double PAYMENTE_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
		public Double paymenteFee(double amount) {
			return amount*PAYMENTE_FEE;
	}

	@Override
	public Double interest(double amount, Integer months) {
		return amount * months * MONTHLY_INTEREST;
	}

	
}

