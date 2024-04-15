package com.satya.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	private Engine eng;

	@Override
	public String toString() {
		return "Vehicle [eng=" + eng + "]";
	}
	
	
}
