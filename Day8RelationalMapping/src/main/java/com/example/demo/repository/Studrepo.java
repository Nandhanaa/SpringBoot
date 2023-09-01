package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Studentmod;

public interface Studrepo extends JpaRepository<Studentmod,Integer> {

}
