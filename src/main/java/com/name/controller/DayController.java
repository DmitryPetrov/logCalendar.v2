package com.name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.name.entity.AppUser;
import com.name.repository.AppUserRepository;

@Controller
public class DayController {
	
	@Autowired
	AppUserRepository repository;
	
	private static final String URI = "/day";
	
	@GetMapping(URI)
	@ResponseBody
	public AppUser postDay() {
		AppUser user = new AppUser();
		user.setId(1);
		user.setName("name");
		user.setRole("admin");
		user.setEncryptedPassword("1");
		
		repository.save(user);
		
		System.out.println("hi");
		return user;
	}

}
