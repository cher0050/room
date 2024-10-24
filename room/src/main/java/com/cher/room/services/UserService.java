package com.cher.room.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cher.room.entities.User;
import com.cher.room.entities.UserPrinciple;
import com.cher.room.repo.UserRepo;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUsername(username);
		
		if(user==null) {
			System.out.println("user doesn't exist");
			throw new UsernameNotFoundException("user doesn't exist");
		}
		
		// TODO Auto-generated method stub
		return new UserPrinciple(user);
	}
	
	public void addUser(User newUser) {
		userRepo.save(newUser);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
}
