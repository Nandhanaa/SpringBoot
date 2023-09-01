package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usermod;

public interface Userepo extends JpaRepository<Usermod,Long>{

}
