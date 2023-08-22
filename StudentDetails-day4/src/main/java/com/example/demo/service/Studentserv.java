package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Studentmodel;
import com.example.demo.repository.Studentrepo;

@Service
public class Studentserv {
	@Autowired
	public Studentrepo st;
	//to save data
	public Studentmodel saveDetails(Studentmodel m) {
		return st.save(m);
	}
	//to get data;
	public List<Studentmodel> getDetails(){
		return st.findAll();
	}
	//to update
	public Studentmodel updateDetails(Studentmodel m) {
		return st.saveAndFlush(m);
	}
	//to delete by id
	public void deleteDetails(int id) {
		System.out.print("deleted");
		 st.deleteById(id);
	}
	//to check(if present delete)
	public boolean checkbydelete(int id) {
		if(st.existsById(id)) {
			{
				st.deleteById(id);
				return true;
			}
		}
		return false;
	}
	//to find(if present display)
	public Optional<Studentmodel> getUserById(int id){
		Optional<Studentmodel>hp=st.findById(id);
		if(hp.isPresent()) {
			return hp;
		}
		return null;
	
	}
	//to update
	public boolean getuserby(int id) {
		if(st.existsById(id)) {
			{
				return true;
			}
		}
		return false;
	}
	
	
	

}
