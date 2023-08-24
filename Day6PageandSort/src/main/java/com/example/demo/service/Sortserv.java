package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sortmodel;
import com.example.demo.repository.Sortrepo;

@Service
public class Sortserv {
	@Autowired
public Sortrepo srepo;
	public Sortmodel saveDetails(Sortmodel sm) {
		return srepo.save(sm);
	}
	//sort by ascending
	public List<Sortmodel> sortbyAsc(String name){
		return srepo.findAll(Sort.by(name).ascending());
	}
	//sort by desceding
	public List<Sortmodel> sortbyDesc(String name){
		return srepo.findAll(Sort.by(name).descending());
	}
	//pagination
public List<Sortmodel> pagination(int pn,int ps){
	Page<Sortmodel> cont=srepo.findAll(PageRequest.of(pn, ps));
	return cont.getContent();
}
//pagination by sorting
public List<Sortmodel> pagesort(int pn,int ps,String name){
	Page<Sortmodel> tp=srepo.findAll(PageRequest.of(pn, ps,Sort.by(name)));
	return tp.getContent();
}

}
