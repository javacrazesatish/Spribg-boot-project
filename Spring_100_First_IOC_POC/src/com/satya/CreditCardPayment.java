package com.satya;

public class CreditCardPayment implements ICardPayment {
	
	public boolean billAmt(Double d) {
		System.out.println("CreditCardPayment method called");
		return true;
	}

}
