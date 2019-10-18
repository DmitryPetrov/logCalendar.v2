package com.name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.name.entity.AppUser;
import com.name.repository.AppUserRepository;

@Controller
public class UserController {
	
	@Autowired
	AppUserRepository repository;
	
	private static final String URI = "/user";
	
	@PostMapping(URI)
	@ResponseBody
	public AppUser add() {
		AppUser user = new AppUser();
		user.setName("name");
		user.setRole("admin");
		user.setEncryptedPassword("nonEncryptedPassword");
		
		repository.save(user);
		
		return user;
	}

}
