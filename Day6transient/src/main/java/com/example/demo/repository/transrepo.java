package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.transmodel;

public interface transrepo extends JpaRepository<transmodel,Integer> {

}
