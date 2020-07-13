package com.chuyenpn.notificationservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseHeroDTO {
	private int port;
	private List<Hero> heroes;
}
