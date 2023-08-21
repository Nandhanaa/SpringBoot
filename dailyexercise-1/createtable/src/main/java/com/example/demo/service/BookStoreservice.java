package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Details;
import com.example.demo.repository.BookStore;

@Service
public class BookStoreservice {
	@Autowired
public BookStore bs;
	public Details saveDetails(Details d) {
		return bs.save(d);
	}
	public List<Details> getDetails(){
		return bs.findAll();
	}

}
