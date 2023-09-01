package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studentmod;
import com.example.demo.repository.Studrepo;

@RestController
@RequestMapping("/")
public class Studcont {
@Autowired
Studrepo srepo;
@PostMapping("/saved")
public Studentmod saveDetails(@RequestBody Studentmod sm) {
	return srepo.save(sm);
}
@GetMapping("/getmap")
public List<Studentmod> getDetails(){
	return srepo.findAll();
}

}
