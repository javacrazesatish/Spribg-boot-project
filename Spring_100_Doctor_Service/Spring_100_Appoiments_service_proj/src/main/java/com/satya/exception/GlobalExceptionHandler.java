package com.satya.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DuplicateNameException.class)
	public ResponseEntity<String> handleDuplicateNameException(DuplicateNameException dne){
		return ResponseEntity.status(HttpStatus.CONFLICT).body("Duplicate Appointment name: "+ dne.getMessage());
	}
	
	@ExceptionHandler(BadRequestTitleException.class)
	public ResponseEntity<Map<String, Object>> handleBadRequestException(BadRequestTitleException bre){
		Map<String, Object> response=new HashMap<>();
		response.put("meassage", "Title is Empty.. "+bre.getMessage());
		response.put("status", HttpStatus.BAD_REQUEST);
		response.put("statusCode", HttpStatus.BAD_REQUEST.value());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response)	;
	}

}
