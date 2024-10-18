package com.cher.room.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/room")
public class RoomController {

	@GetMapping("/hello")
	public String displayHello() {
		return "Hello guys";
	}
	
	public String getAllUsers() {
		return "edavalu";
	}
}
