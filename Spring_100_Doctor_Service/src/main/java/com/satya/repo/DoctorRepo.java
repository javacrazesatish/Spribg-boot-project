/**
 * 
 */
package com.satya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.entity.DoctorEntity;

/**
 * 
 */
@Repository
public interface DoctorRepo extends JpaRepository<DoctorEntity, Long> {

}
