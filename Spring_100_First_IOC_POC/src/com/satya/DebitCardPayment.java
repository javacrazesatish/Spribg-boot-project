package com.satya;

public class DebitCardPayment implements ICardPayment {

	public boolean billAmt(Double d) {
		 System.out.println("Debit card Payment method called...");
		return true;
	}
}
