package com.satya.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.entity.DoctorEntity;
import com.satya.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired(required=true)
	private DoctorService service;
	
	
	@PostMapping("/saveDoctor")
	public String postMethodName(@RequestBody DoctorEntity entity) {
		service.addDoctor(entity);
		return "doctor object save Succefully..!";
	}
	
	
	
	

}
