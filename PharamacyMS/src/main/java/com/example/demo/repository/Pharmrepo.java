package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pharmodel;

public interface Pharmrepo extends JpaRepository<Pharmodel,Integer> {

}
