package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.model.Pharmodel;



public interface Pharmrepo extends JpaRepository<Pharmodel,Integer> {
	//query
			//native query[to get all rows
			@Query(value="select * from pharmacymanagementsys.pharm_details",nativeQuery=true)
		public List<Pharmodel> getAllRows();
			//1..to get specificcont
			@Query(value="select * from pharmacymanagementsys.pharm_details where batch_Id=:batchId and drug_Name=:drugName",nativeQuery=true)
			public List<Pharmodel> getRows(@Param("batchId") int batchId,@Param("drugName" )String drugName);
			
}
