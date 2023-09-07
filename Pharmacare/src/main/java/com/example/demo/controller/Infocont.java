package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Infomod;
import com.example.demo.service.Infoserv;


@RestController
@RequestMapping("/Infor")
@CrossOrigin("*")
public class Infocont {
	
	
		@Autowired
	Infoserv ps;
		@PostMapping("/postdata")
	public Infomod savecontrol(@RequestBody Infomod pm) {
		return ps.saveDetails(pm);
	}
		@GetMapping("/get")
	public List<Infomod> getcontrol(){
		return ps.getDetails();
	}
		@PutMapping("/put/{batchId}/{drugName}")
	public  Infomod updatecontrol(@RequestBody Infomod pm,@PathVariable ("batchId") int batchId,@PathVariable ("drugName") String drugName) {
		return ps.updateDetails(pm);
	}
		@DeleteMapping("/delete/{batchId}")
	public String removeid(@PathVariable ("batchId") int batchId) {
		 ps.deleteDetails(batchId);
		return "Batch Id"+batchId+" is deleted";
	}
		@GetMapping("/get/{batchId}")
		public Infomod getStudentID(@PathVariable int batchId) {
			return ps.getStudentid(batchId);
		}
		//update new..
		@PutMapping("/update/{batchId}/{drugName}")
	    public int updateRoom(@PathVariable int batchId, @PathVariable  String drugName) {
	   		
	   		return ps.updateroom(batchId, drugName);
	        //return ResponseEntity.ok("Room availability updated successfully");
	    }
	
}