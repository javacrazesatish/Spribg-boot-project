package com.satya.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMsg {

	public String generateWishMsh(String name) {

		int hrs = 0;
		Calendar cal = Calendar.getInstance();
		hrs = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("hrs ::"+ hrs);
		if (hrs <= 12 && hrs>=4) {
			return "Good Morning " + name;
		} else if (hrs <= 16) {
			return "Good Afternoon " + name;
		} else if (hrs <= 20) {
			return "Good Evening " + name;
		} else {
			return "Good Night " + name;
		}

	}

}
