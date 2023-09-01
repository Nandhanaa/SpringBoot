package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usermod;
import com.example.demo.repository.Userepo;

@RestController
@RequestMapping("/")
public class Usercont {
@Autowired
Userepo urepo;
@PostMapping("/postsave")
public Usermod saveDetails(@RequestBody Usermod us) {
	return urepo.save(us);
}
@GetMapping("/get")
public List<Usermod>getDetails(){
	return urepo.findAll();
}
@DeleteMapping("/delete/{usid}")
public String delete(@PathVariable("usid") int usid) {
	return "Id"+usid+"is deleted";
}

}
