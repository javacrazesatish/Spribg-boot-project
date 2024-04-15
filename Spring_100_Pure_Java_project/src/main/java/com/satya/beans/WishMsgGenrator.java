package com.satya.beans;

import java.util.Date;

class WishMsgGenrator {
	
	
	public String generateWishMsg() {

		int hrs = new Date().getHours();

		if (hrs <= 12) {
			return "Good Morning ";
		} else if (hrs <= 16) {
			return "Good Afternoon ";
		} else if (hrs <= 20) {
			return "Good Evening ";
		} else {
			return "Good night ";
		}
	}

}
