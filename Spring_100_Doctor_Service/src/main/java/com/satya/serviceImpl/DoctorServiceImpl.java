package com.satya.serviceImpl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.entity.DoctorEntity;
import com.satya.repo.DoctorRepo;
import com.satya.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	private final DoctorRepo repo;
	private final Logger logger;

	@Autowired
	public DoctorServiceImpl(DoctorRepo repo, Logger logger) {
		this.repo = repo;
		this.logger = logger;
	}

	@Override
	public void addDoctor(DoctorEntity doctor) {
		logger.info("save doctor entity");
		repo.save(doctor);
	}

}
