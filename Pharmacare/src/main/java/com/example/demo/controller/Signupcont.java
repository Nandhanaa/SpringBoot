package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signupmod;
import com.example.demo.service.Signupserv;



@RestController
@RequestMapping("/sign")
@CrossOrigin("*")
public class Signupcont {
	@Autowired
	Signupserv serv;
	@PostMapping("/saveDetails")
	public Signupmod savecontrol(@RequestBody Signupmod sm) {
		return serv.saveDetails(sm);
	}
	
	
	
	
	
	

	

}
