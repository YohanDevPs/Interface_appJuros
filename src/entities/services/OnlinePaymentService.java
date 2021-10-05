package entities.services;

public interface OnlinePaymentService  {

	Double paymenteFee(double amount);
	Double interest(double amount, Integer months);
	
	
}
