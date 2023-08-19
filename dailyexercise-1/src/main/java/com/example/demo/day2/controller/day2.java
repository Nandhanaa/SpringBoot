package com.example.demo.day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class day2 {
	@Value("Welcome to Spring Tool Suite")
	public String name;
	@GetMapping("day2/ex")
public String display() {
	return "HEY!... "+name+" :)";
}
}
