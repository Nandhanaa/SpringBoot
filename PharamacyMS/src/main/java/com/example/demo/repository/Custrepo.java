package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Custmod;

public interface Custrepo extends JpaRepository<Custmod,Integer> {

}
