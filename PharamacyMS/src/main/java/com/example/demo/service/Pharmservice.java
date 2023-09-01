package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

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
	//sortbyasc 
	public List<Pharmodel> sortbyAsc(String drugName){
			return pro.findAll(Sort.by(drugName).ascending());
		}
	//sortbydes
		public List<Pharmodel> sortbyDesc(String drugName){
			return pro.findAll(Sort.by(drugName).descending());
		}
		//pagination
		public List<Pharmodel> pagination(int pn,int ps){
			Page<Pharmodel> cont=pro.findAll(PageRequest.of(pn, ps));
			return cont.getContent();
		}
		//pagination by sorting
		public List<Pharmodel> pagesort(int pn,int ps,String name){
			Page<Pharmodel> tp=pro.findAll(PageRequest.of(pn, ps,Sort.by(name)));
			return tp.getContent();
		}
		//query
		//to get all rows
		public List<Pharmodel> getAllrows()
		{
			return pro.getAllRows();
		}
		//get specific rows
				public List<Pharmodel> getrowserv(int batchId,String drugName)
				{
					return pro.getRows(batchId, drugName);
				}
	 
}
