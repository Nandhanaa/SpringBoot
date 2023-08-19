package com.example.demo.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ex3 {
	@Value("Yellow")
	 public String color;
	@GetMapping("day1/ex3")
public String getMyFav() {
	
	return "My Favorite color is"+ color;
}
}
