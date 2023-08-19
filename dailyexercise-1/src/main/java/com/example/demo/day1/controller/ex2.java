package com.example.demo.day1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex2 {
	@Value("Nandhanaa")
	public String name;
@GetMapping("/day1/ex2")
	public String getName() {
		return "Welcome "+name+" !";
	}

}
