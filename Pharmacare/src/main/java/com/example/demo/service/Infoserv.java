package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Infomod;
import com.example.demo.repository.Inforepo;


@Service
public class Infoserv {
	@Autowired	

		Inforepo pro;
		public Infomod saveDetails(Infomod ph) {
			return pro.save(ph);
		}
		public List<Infomod> getDetails(){
			return pro.findAll();
		}
		public Infomod updateDetails(Infomod ph) {
			return pro.saveAndFlush(ph);
		}
		public void deleteDetails(int batchId) {
			System.out.print("Batch Id is deleted");
			pro.deleteById(batchId);
		}
		// get the data using id
		public Infomod getStudentid(int batchId) {
			return pro.findById(batchId).orElse(null);
		}
		public boolean checkdelete(int batchId) {
			if(pro.existsById(batchId)) {
				{
					pro.deleteById(batchId);
				    System.out.print("The given Batch Id is deleted");
				   return true;
				}
			}
		return false;
	}
		//update new
		public int updateroom(int batchId,String drugName) {
			  return pro.updateid(batchId, drugName);
		  }
		//
		
		public Optional<Infomod> updateUserById(int batchId){
			Optional<Infomod> hp=pro.findById(batchId);
			if(hp.isPresent()) {
				return hp;
			}
			return null;
		}
}		