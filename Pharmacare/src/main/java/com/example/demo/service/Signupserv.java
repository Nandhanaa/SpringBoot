package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.model.Signupmod;

import com.example.demo.repository.Signuprepo;

@Service
public class Signupserv {
	@Autowired
	Signuprepo srepo;
	
	//signup

	public Signupmod saveDetails(Signupmod  ph) {
		return srepo.save(ph);
	}
	
	
	
	

}
