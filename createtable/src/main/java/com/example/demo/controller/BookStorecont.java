package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Details;
import com.example.demo.service.BookStoreservice;

@RestController
public class BookStorecont {
	@Autowired
BookStoreservice bookser;
	@PostMapping("/saveDetails")
public Details contDetails(@RequestBody Details d) {
	return bookser.saveDetails(d);
}
	@GetMapping("/getDetails")
	public List<Details> getdatadetails(){
		return bookser.getDetails();
	}


}
