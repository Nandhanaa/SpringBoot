package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pharmodel;

import com.example.demo.service.Pharmservice;


@RestController
public class Pharmcontroller {
	@Autowired
Pharmservice ps;
	@PostMapping("/save")
public Pharmodel savecontrol(@RequestBody Pharmodel pm) {
	return ps.saveDetails(pm);
}
	@GetMapping("/getmap/")
public List<Pharmodel> getcontrol(){
	return ps.getDetails();
}
	@PutMapping("/update")
public Pharmodel updatecontrol(@RequestBody Pharmodel pm) {
	return ps.updateDetails(pm);
}
	@DeleteMapping("/deleteby/{id}")
public String removeid(@PathVariable ("id") int id) {
	 ps.deleteDetails(id);
	return "Batch Id"+id+" is deleted";
}
	@DeleteMapping("/deletebyreq")
public String removebyreq(@RequestParam ("id") int id) {
	ps.deleteDetails(id);
	return "Given BatchId"+id+"is deleted";
}
	@DeleteMapping("deletecheck/{id}")
public ResponseEntity<String> cdelete(@PathVariable ("id") int id){
	boolean deleted=ps.checkdelete(id);
	if(deleted) {
		return ResponseEntity.ok(id+"id is deleted");
	}
	else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch "+id+"not found");
	}
}
	@GetMapping("updatecheck/{id}")
public ResponseEntity<?>getuserById(@PathVariable int id){
	Optional<Pharmodel> tp=ps.updateUserById(id);
	if(tp!=null) {
		return ResponseEntity.ok(tp);
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch "+id+"not found");
}
}

