package com.satya.bean;

public class PaymentProcessor {

	private ICardPayment cardPayment = null;
	
//	// setter method injection
//	public void setICardPayment(ICardPayment cardPayment) {
//		this.cardPayment = cardPayment;
//	}

	// Constructor injection
	public PaymentProcessor(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}
	

	public boolean doPayment( Double billAmt) {
		return cardPayment.payBill(123.4);
				
	}

}
