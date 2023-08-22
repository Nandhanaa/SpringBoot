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

import com.example.demo.model.Studentmodel;
import com.example.demo.service.Studentserv;

@RestController
public class Studentcontro {
	@Autowired
Studentserv se;
	//to post info
	@PostMapping("/saveDetails")
	public Studentmodel savecontrol(@RequestBody Studentmodel sm) {
		return se.saveDetails(sm);
	}
	//to get info
	@GetMapping("/getDetails")
	public List<Studentmodel> getcontrol(){
		return se.getDetails();
	}
	//to put info
	@PutMapping("/updateDetails")
	public Studentmodel updateDetails(@RequestBody Studentmodel hi) {
		return se.updateDetails(hi);
	}
	//to delete info by id
	@DeleteMapping("/deletebypath/{id}")
	public String removeHotel(@PathVariable ("id") int hid) {
		se.deleteDetails(hid);
		return "Hotel with id"+hid+"is deleted";
	}
	//to delete by id 
	@DeleteMapping("/deletebyreq")
	public String remove(@RequestParam ("id") int id) {
		se.deleteDetails(id);
		return "Hotel with id"+id+"is hye deleted";
	}
	//to delete 
	@DeleteMapping("/pathdelete/{id}")
	
public ResponseEntity<String> cdelete(@PathVariable int id){
	boolean deleted=se.checkbydelete(id);
	if(deleted) {
		return ResponseEntity.ok("new"+id+" id is deleted");
	}
	else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel"+id+"not found");
	}
}
	@GetMapping("/user/{id}")
	public ResponseEntity<?>getuserById(@PathVariable int id){
	
		Optional<Studentmodel> tp=se.getUserById(id);
		if(tp!=null) {
			return ResponseEntity.ok(tp);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel"+id+"not found");
	}

@PutMapping("/updateDetails")
public ResponseEntity<?>getuserBy(@PathVariable int id){
	
	Optional<Studentmodel> tp=se.getUserById(id);
	
	if(tp!=null) {
		return ResponseEntity.ok(tp);
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel"+id+"not found");
}
}

