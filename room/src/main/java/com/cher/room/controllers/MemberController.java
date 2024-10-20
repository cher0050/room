package com.cher.room.controllers;

import java.util.*;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.cher.room.entities.Member;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MemberController {
	
	List<Member> members = new ArrayList<>(List.of(
			new Member("Madhu",2500.60,new ArrayList<>(List.of("rentshare",1000.0))),
			new Member("Babu",2600.50,new ArrayList<>(List.of("rentshare",1000.0)))
			));
	
	@GetMapping("/members")
	public List<Member> getAllMembers(){
		return members;
	}
	@GetMapping("/getToken")
	public CsrfToken getToken(HttpServletRequest request){
		return (CsrfToken) request.getAttribute("_csrf");
	}
	

	@PostMapping("/addMembers")
	public List<Member> add(@RequestBody Member member) {
		members.add(member);
		return members;
	}
}
