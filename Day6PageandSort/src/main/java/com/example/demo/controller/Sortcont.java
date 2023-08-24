package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sortmodel;
import com.example.demo.service.Sortserv;

@RestController
public class Sortcont {
	@Autowired
	Sortserv ser;
	//to save
	@PostMapping("/savesort")
	public Sortmodel savecont(@RequestBody Sortmodel sm) {
		return ser.saveDetails(sm);
	}
	//sort by asc
	@GetMapping("/sortbyAsc/{name}")
	public List<Sortmodel> sortasc(@PathVariable("name") String name){
		return ser.sortbyAsc(name);
		
	} 
	//sort by desc
	@GetMapping("/sortbyDesc/{name}")
	public List<Sortmodel> sortdes(@PathVariable("name") String name){
		return ser.sortbyDesc(name);
	}
//pagination
	@GetMapping("/pagin/{pn}/{ps}")
	public List<Sortmodel> paginex(@PathVariable("pn") int pn,@PathVariable("ps") int ps){
		return ser.pagination(pn,ps);
	}
//pagination by sort
	@GetMapping("/pagesort/{pn}/{ps}/{name}")
	public List<Sortmodel> pagesortex(@PathVariable("pn") int pn,@PathVariable("ps") int ps,@PathVariable("name") String name){
		return ser.pagesort(pn, ps, name);
	}
}
