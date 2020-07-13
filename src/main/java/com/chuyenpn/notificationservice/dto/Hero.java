package com.chuyenpn.notificationservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
	private int id;
	private String type;
	private String displayName;
	private List<Integer> powers;
	private String img;
	private boolean busy;
}
