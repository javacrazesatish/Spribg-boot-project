package com.satya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AopController {
	
	@GetMapping("/health")
	public String getMethodName() {
		System.out.println("Hello Aop   my Event Logic..");
		int no=11/0;
		return "Hello ,Aop..";
	}
	

}
