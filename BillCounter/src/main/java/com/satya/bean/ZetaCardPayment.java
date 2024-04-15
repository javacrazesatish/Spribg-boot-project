package com.satya.bean;

public class ZetaCardPayment implements ICardPayment {
	
	public boolean payBill(Double billAmt) {
		System.out.println("Pay Bill Amt usig Zeta Card ");
		return true;
	}


}
