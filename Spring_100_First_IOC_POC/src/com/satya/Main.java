package com.satya;

public class Main {

	public static void main(String[] args) {

	
		PaymentProcessor pp=new PaymentProcessor(new CreditCardPayment());
		
		pp.setPaymentCrad(new CreditCardPayment());
		
//		boolean billAmt = pp.billAmt(123.44)	;	
				
		boolean doPayment = pp.doPayment(123.45);
		
		if (doPayment) {
			System.out.println("Payment Process Succefully...");
		}else {
			System.out.println("Falied to Process Payment.... Try Again..");
		}
		
		
		
	}

}
