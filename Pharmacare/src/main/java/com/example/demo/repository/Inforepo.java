package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Infomod;

import jakarta.transaction.Transactional;

public interface Inforepo extends JpaRepository<Infomod,Integer> {
	@Transactional
    @Modifying
    @Query(value="UPDATE pharmacare.pharm_details r SET r.drug_name =:drugName WHERE r.batch_id = :batchId",nativeQuery=true)
    public int  updateid(@Param("batchId") int batchId, @Param("drugName") String drugName);
}
