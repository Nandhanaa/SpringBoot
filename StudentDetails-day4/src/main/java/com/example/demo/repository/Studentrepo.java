package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Studentmodel;

public interface Studentrepo extends JpaRepository<Studentmodel,Integer>{

}
