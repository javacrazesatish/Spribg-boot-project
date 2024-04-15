package com.satya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.entity.AppoimentEntity;

@Repository
public interface AppoimentsRepo extends JpaRepository<AppoimentEntity, Long> {
	
	
	public AppoimentEntity findByIdAndTitle(Long id, String title);//select * from appoiments where id=1 and title ="metting";

	public boolean existsByTitle(String title);

}
