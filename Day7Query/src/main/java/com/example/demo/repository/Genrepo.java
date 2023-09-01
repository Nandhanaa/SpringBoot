package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Genremodel;

public interface Genrepo extends JpaRepository<Genremodel,Integer> {
//native query[to get all rows]
	@Query(value="select * from genre.genremodel",nativeQuery=true)
public List<Genremodel> getAllRows();
	
	//1..to get specificcont
@Query(value="select * from genre.genremodel where id=:id and author=:author",nativeQuery=true)
public List<Genremodel> getRows(@Param("id") int id,@Param("author" )String author);


//native query
//@Query(value="select * from genre.genremodel where genre like %l%",nativeQuery=true)---
@Query("Select h from Genremodel h where h.Genre =:genre")
public List<Genremodel> getnamerep(@Param("genre") String genre);
}
