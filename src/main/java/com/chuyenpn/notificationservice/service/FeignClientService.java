package com.chuyenpn.notificationservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.chuyenpn.notificationservice.dto.ResponseDTO;

// @FeignClient(name="feign-client-notification-service", url="localhost:8100")
@FeignClient(name="feign-client-notification-service")
@RibbonClient(name="feign-client-notification-service")
public interface FeignClientService {
	
	@GetMapping("/users")
	public ResponseDTO getAllUsers();
}
