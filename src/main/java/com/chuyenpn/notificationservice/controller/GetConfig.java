package com.chuyenpn.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chuyenpn.notificationservice.dto.CompanyConfigDTO;

@RestController
public class GetConfig {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/config")
	public CompanyConfigDTO getCompanyConfig() {
		return new CompanyConfigDTO(environment.getProperty("notification.company.name"),
				environment.getProperty("notification.company.phone"));
	}
}
