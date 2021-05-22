package com.hexor;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice

public class MyExceptionhandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleResNotf(Exception e, WebRequest r){
		return new ResponseEntity(new ErrorDetails(new Date(),"hdfjjdjfjdjf"),HttpStatus.NOT_FOUND);
	}
	
	
}
