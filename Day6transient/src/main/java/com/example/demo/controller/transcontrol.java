package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.transmodel;
import com.example.demo.service.transerv;

@RestController
public class transcontrol {
@Autowired
public transerv ts;
@PostMapping("/save")
public transmodel transc(@RequestBody transmodel tm) {
	return ts.saveDetails(tm);
}
@GetMapping("/getmap/")
public List<transmodel> getcontrol(){
	return ts.getDetails();
}
}
