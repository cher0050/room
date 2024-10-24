package com.cher.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cher.room.entities.Member;
import com.cher.room.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
