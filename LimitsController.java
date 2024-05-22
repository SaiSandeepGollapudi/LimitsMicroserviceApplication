package com.companyName.limitsMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyName.limitsMicroservice.bean.Limits;
import com.companyName.limitsMicroservice.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	

//The limits service provides dynamic minimum and maximum constraints for certain operations or 
//	functionalities within the application. It ensures that these constraints can be easily adjusted 
//	without code changes, allowing for better control over resources, preventing abuse, and enforcing 
//	business logic constraints. By using externalized configuration, it enables dynamic adjustments 
//	without redeployment, thus enhancing flexibility and scalability.
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	
		//	return new Limits(1,1000);
	}
}
