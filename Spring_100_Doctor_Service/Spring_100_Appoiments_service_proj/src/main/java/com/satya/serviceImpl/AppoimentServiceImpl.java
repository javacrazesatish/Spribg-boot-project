package com.satya.serviceImpl;

import java.util.Optional;

import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.entity.AppoimentEntity;
import com.satya.exception.BadRequestTitleException;
import com.satya.exception.DuplicateNameException;
import com.satya.repository.AppoimentsRepo;
import com.satya.service.AppoimentService;

@Service
public class AppoimentServiceImpl implements AppoimentService {
	
	private static final Logger logging =LoggerFactory.getLogger(AppoimentServiceImpl.class);
	
	private AppoimentsRepo repo;
	
	@Autowired
	public AppoimentServiceImpl(AppoimentsRepo repo) {
		logging.warn("Inject AppoimentsRepo obj to Service class using Constructore injection...");
		this.repo=repo;
	}

	@Override
	public void saveAppoimentEntity(AppoimentEntity appoimentEntity) {
		
		logging.info("Save AppoimentEntity... ");
		 repo.save(appoimentEntity);
		
	}

	@Override
	public AppoimentEntity getAppoimentEntity(Long id) {
		Optional<AppoimentEntity> byId = repo.findById(id);//send
		
		return byId.orElse(null);
	}

	@Override
	public AppoimentEntity getAppiomentRecordByIdAndtitle(Long id, String title) {
		logging.info("Service class getAppiomentRecordByIdAndtitle Req id :"+id +", title :"+title);
		AppoimentEntity appoimentResp = repo.findByIdAndTitle(id,title);
		if (appoimentResp!=null) {
			return appoimentResp;
		}else {
			logging.info("record is not Available this Req id :"+id +", title :"+title);
		}
		return appoimentResp;
	}

	@Override
	public AppoimentEntity updateApppoimentData(Long id, AppoimentEntity appoimentEntity) {
		
		if(appoimentEntity.getTitle()==null || appoimentEntity.getTitle().isEmpty()) {
			throw new BadRequestTitleException("Title field should not Empty ");
		}
		
		
		Optional<AppoimentEntity> byId = repo.findById(id);
		
		AppoimentEntity appEntity = byId.orElse(null);
		appEntity.setTitle(appoimentEntity.getTitle());
		appEntity.setStartTime(appoimentEntity.getStartTime());
		appEntity.setEndTime(appoimentEntity.getEndTime());
		
		AppoimentEntity updatedRespAppEntity = repo.save(appEntity);
		return updatedRespAppEntity;
	}

}
