package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Genremodel;
import com.example.demo.service.Genserv;


@RestController
public class Gencont {
	@Autowired
	Genserv gserv;
	//to get all rows
	@GetMapping("/getAllrows")
	public List<Genremodel> getAllrows()
	{
		 return gserv.getAllrows();
	}
	//to disp specf rows
	@GetMapping("/getSpecific/{id}/{author}")
	public List<Genremodel> getSpecrows(@PathVariable("id") int id,@PathVariable("author") String author)
	{
		 return gserv.getrowserv(id, author);
	}
	@GetMapping("/getjql/{genre}")
	public List<Genremodel> getByname (@PathVariable("genre") String genre){
		return gserv.getnameserv(genre);
	}

}
