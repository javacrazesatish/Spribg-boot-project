package com.satya.bean;

public class CreditCardPayment implements ICardPayment {
	
	public boolean payBill(Double billAmt) {
		System.out.println("Pay Bill Amt usig Credit Card ");
		return true;
	}

}
