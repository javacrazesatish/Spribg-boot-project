package com.satya.bean;

public class DebitCardPayment implements ICardPayment{
	
	public boolean payBill(Double billAmt) {
		System.out.println("Pay Bill Amt usig Debit Card ");
		return true;
	}


}
