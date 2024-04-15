package com.satya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.model.Doctor;
import com.satya.service.DoctorService;

@RestController
@RequestMapping("/DoctorService")
public class DoctorController {
	
	private DoctorService doctorService ;
	
	@Autowired
	public void setDoctorService(DoctorService doctorService) {
		this.doctorService=doctorService;
	}
	
	
	@PostMapping("/saveDoctor")
	public String saveDoctor(@RequestBody  Doctor doctor) {
		doctorService.saveDoctor(doctor);
		return "Doctor Object Saved Succeessfully ...!";
	}
	

}
