package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Userswag;
import com.example.demo.model.repository.Userrepos;



@Service
public class Userserv {
@Autowired
Userrepos pro;
public Userswag saveDetails(Userswag ph) {
	return pro.save(ph);
}
public List<Userswag> getDetails(){
	return pro.findAll();
}
public Userswag updateDetails(Userswag ph) {
	return pro.saveAndFlush(ph);
}
public void deleteDetails(int id) {
	System.out.print("Batch Id is deleted");
	pro.deleteById(id);
}

}
