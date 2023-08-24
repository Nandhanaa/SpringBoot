package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pharmodel;
import com.example.demo.repository.Pharmrepo;

@Service
public class Pharmservice {
	@Autowired
	Pharmrepo pro;
	public Pharmodel saveDetails(Pharmodel ph) {
		return pro.save(ph);
	}
	public List<Pharmodel> getDetails(){
		return pro.findAll();
	}
	public Pharmodel updateDetails(Pharmodel ph) {
		return pro.saveAndFlush(ph);
	}
	public void deleteDetails(int id) {
		System.out.print("Batch Id is deleted");
		pro.deleteById(id);
	}
	public boolean checkdelete(int id) {
		if(pro.existsById(id)) {
			{
				pro.deleteById(id);
			    System.out.print("The given Batch Id is deleted");
			   return true;
			}
		}
	return false;
}
	public Optional<Pharmodel> updateUserById(int id){
		Optional<Pharmodel> hp=pro.findById(id);
		if(hp.isPresent()) {
			return hp;
		}
		return null;
	}
}
