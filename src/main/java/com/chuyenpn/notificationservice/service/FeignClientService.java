package com.chuyenpn.notificationservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.chuyenpn.notificationservice.dto.ResponseDTO;
import com.chuyenpn.notificationservice.dto.ResponseHeroDTO;

// @FeignClient(name="feign-client-notification-service", url="localhost:8100")
//@FeignClient(name="feign-client-notification-service")
//RibbonClient(name="feign-client-notification-service")
// @FeignClient(name="user-service")
@FeignClient(name="zuul-server")
// @RibbonClient(name="user-service")
public interface FeignClientService {
	
	@GetMapping("/user-service/users")
	public ResponseDTO getAllUsers();
	
	
	@GetMapping("/heroes-service/heroes")
	public ResponseHeroDTO getAllHeroes();
}
