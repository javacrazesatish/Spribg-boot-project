package com.satya.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Custom repository methods can be added here if needed
}
