package com.cher.room.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController("/room")
public class RoomController {

	@GetMapping("/hello")
	public String displayHello(HttpServletRequest request) {
		return "Hello guys"+ request.getRequestedSessionId();
	}
	
	public String getAllUsers() {
		return "edavalu";
	}
	
//	https://github.com/cher0050/room.git
}
