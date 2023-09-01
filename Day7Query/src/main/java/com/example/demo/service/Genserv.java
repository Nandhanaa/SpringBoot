package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Genremodel;
import com.example.demo.repository.Genrepo;

@Service
public class Genserv {
	@Autowired
	Genrepo grepo;
	public List<Genremodel> getAllrows()
	{
		return grepo.getAllRows();
	}
	
	//get specific rows
		public List<Genremodel> getrowserv(int id,String author)
		{
			return grepo.getRows(id, author);
		}
		//get by name
		public List<Genremodel> getnameserv(String genre){
			return grepo.getnamerep(genre);
		}
	

}
