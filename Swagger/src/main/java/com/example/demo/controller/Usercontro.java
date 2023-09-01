package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Userswag;
import com.example.demo.service.Userserv;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class Usercontro {
	@Autowired
	
	Userserv ps;
		@PostMapping("/save")
		@Tag(name="Save Details",description="Save User details")
	public  Userswag savecontrol(@RequestBody Userswag pm) {
		return ps.saveDetails(pm);
	}
		@GetMapping("/getmap/")
		@Tag(name="Get Details",description="Get User details")
	public List<Userswag> getcontrol(){
		return ps.getDetails();
	}
		@PutMapping("/update")
		@Tag(name="Update Details",description="Update user details")
	public  Userswag updatecontrol(@RequestBody  Userswag pm) {
		return ps.updateDetails(pm);
	}
		@DeleteMapping("/deleteby/{id}")
		@Tag(name="Delete details",description="delete by given id")
	public String removeid(@PathVariable ("id") int id) {
		 ps.deleteDetails(id);
		return "Batch Id"+id+" is deleted";
		}
}
