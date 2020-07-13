package com.chuyenpn.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chuyenpn.notificationservice.dto.ResponseHeroDTO;
import com.chuyenpn.notificationservice.service.FeignClientService;

@RestController
public class GetHero {
		
	@Autowired
	FeignClientService feignClient;
	
	@GetMapping("/get-heros-from-nodejs")
	public ResponseHeroDTO getHerosFromNodejs() {
		return feignClient.getAllHeroes();
	}
}
