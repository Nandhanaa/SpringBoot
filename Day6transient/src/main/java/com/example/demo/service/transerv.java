package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.transmodel;
import com.example.demo.repository.transrepo;
@Service
public class transerv {
	@Autowired
public transrepo tr;
public transmodel saveDetails(transmodel tp) {
	return tr.save(tp);
}
public List<transmodel> getDetails(){
	return tr.findAll();
}
}
