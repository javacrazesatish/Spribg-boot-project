package com.satya.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.satya.entity.AppoimentEntity;
import com.satya.exception.BadRequestTitleException;
import com.satya.service.AppoimentService;



@RestController
@RequestMapping("/appointment")
public class AppoimentController {
	
	private static final Logger logger=LoggerFactory.getLogger(AppoimentController.class);
	
	private AppoimentService appoimentService;
	
	@Autowired
	public AppoimentController(AppoimentService appoimentService) {
		logger.warn("Injected Service obj to Controller class..");
		this.appoimentService=appoimentService;
	}
	
	@PostMapping("/saveappoiment")
	public  String saveAppoiment(@RequestBody AppoimentEntity Appoiment) {
		logger.info("Request body for save ."+Appoiment);
		appoimentService.saveAppoimentEntity(Appoiment);
		
		return "Appoment Object Saved Successfully....!";
	}

	@GetMapping("/getappoiment/{id}")             //localhost:7878/appointment/getappoiment/1
	public AppoimentEntity getAppoiment(@PathVariable Long id) {
		logger.info("get AppoimentEntity Id : "+id);

		AppoimentEntity appoimentEntity = appoimentService.getAppoimentEntity(id);
		logger.info("get AppoimentEntity obj : "+appoimentEntity);
		if (appoimentEntity!=null ) {
			return appoimentEntity ;
		}else {
			logger.error("Oject is not avaiable....");
		}
		return appoimentEntity ;
	}
	
	@GetMapping("/getByIdTitle")          //localhost:7878/appointment/getByIdTitle?id=1&title=metting
	public AppoimentEntity getAppiomentDataByIdAndtitle(@RequestParam(required = false) Long id,
			                                            @RequestParam(required = false) String title) {
		
		if(id==null && title==null) {
			throw new BadRequestTitleException("bad input parameter");
		}
		
		
		logger.info("getByIdTitle Request params are id :"+id +"title : "+title);
		AppoimentEntity appiomentResp = appoimentService.getAppiomentRecordByIdAndtitle(id, title);
		if (!ObjectUtils.isEmpty(appiomentResp)) {
			return appiomentResp;
		} else {
			logger.info("Controler filter method Record Not Available Req :"+id +"title : "+title);
		}
		return appiomentResp;
		
	}
	
	@PutMapping("/updateRecord/{id}")   //localhost:7878/appointment/updateRecord/1   AppoimentEntity=body 
	public AppoimentEntity updateAppoimnetData(@PathVariable Long id,  @RequestBody AppoimentEntity appoimentEntity) {
		logger.info(" controller updateAppoimnetData Request params are id :"+id +",  updateAppoimnetData : "+appoimentEntity);
		AppoimentEntity updateApppoimentData = appoimentService.updateApppoimentData(id, appoimentEntity);
		
		return updateApppoimentData;
	}
	
}
