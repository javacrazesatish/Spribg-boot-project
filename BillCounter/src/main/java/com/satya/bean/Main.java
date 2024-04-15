package com.satya.bean;

public class Main {

	public static void main(String[] args) {
		
		PaymentProcessor processor= new PaymentProcessor(new ZetaCardPayment());
		
//		processor.setICardPayment(null);
		
		boolean paymentStatus = processor.doPayment(123.34);
		
		if(paymentStatus) {
			System.out.println("Payment processed Successfully...!");
		}else {
			System.out.println("Failed to process Payment...!");
		}
	}
	
	
}
