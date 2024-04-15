package com.satya;

public class PaymentProcessor {
	
	
	public ICardPayment iCardPayment ;

//	//Constructor injection
	public PaymentProcessor(ICardPayment iCardPayment) {

		this.iCardPayment = iCardPayment;
	}

	public void setPaymentCrad(ICardPayment iCardPayment ) {
		this.iCardPayment=iCardPayment;
		
	}
	public boolean doPayment(Double billAmt) {
		return iCardPayment.billAmt(billAmt);
	}
	
}
