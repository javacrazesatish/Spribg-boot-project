package com.satya.service;

import org.apache.coyote.BadRequestException;

import com.satya.entity.AppoimentEntity;

public interface AppoimentService {
	
	public void saveAppoimentEntity(AppoimentEntity appoiment);
	
	public AppoimentEntity getAppoimentEntity(Long id);
	
	public AppoimentEntity getAppiomentRecordByIdAndtitle(Long id,String title);
	
	public AppoimentEntity updateApppoimentData(Long id ,AppoimentEntity appoimentEntity);

}
