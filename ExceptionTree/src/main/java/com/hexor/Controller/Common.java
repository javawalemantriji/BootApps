package com.hexor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexor.MyExceptionhandler;

@RestController
@RequestMapping("/common")
public class Common {
	
	
	@RequestMapping("/greet/{id}")
public String hello(@PathVariable ("id") int id){
		
		if(id==10) {
			return "hello";	
		}else {
			throw new ConfigDataResourceNotFoundException(null);
		}
	
}
}
