package com.satya.service;

import org.springframework.stereotype.Service;

import com.satya.entity.DoctorEntity;

@Service
public interface DoctorService {
	
	void addDoctor(DoctorEntity doctore);

}
