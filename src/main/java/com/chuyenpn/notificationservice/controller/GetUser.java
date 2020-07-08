package com.chuyenpn.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chuyenpn.notificationservice.dto.ResponseDTO;
import com.chuyenpn.notificationservice.service.FeignClientService;

@RestController
public class GetUser {
		
	@Autowired
	FeignClientService feignClient;
	
	@GetMapping("/get-users-from-notification-service")
	public ResponseDTO getUserFromNotiService() {
		return feignClient.getAllUsers();
	}
}
