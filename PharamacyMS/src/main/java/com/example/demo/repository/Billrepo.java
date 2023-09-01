package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Billmod;

public interface Billrepo extends JpaRepository<Billmod,Integer>{

}
