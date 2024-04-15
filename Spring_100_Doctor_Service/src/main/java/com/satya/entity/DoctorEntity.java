package com.satya.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DoctorEntity {
	
	@Id
	private Long id;
	private String name;
	private String specialization;
	
	public DoctorEntity() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "DoctorEntity [id=" + id + ", name=" + name + ", specialization=" + specialization + "]";
	}

}
