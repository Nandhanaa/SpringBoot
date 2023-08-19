package com.example.demo.day1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex1 {
	@RequestMapping("/day1/ex1")
public String Welcome() {
	return "Welcome Spring Boot!";
}
}
