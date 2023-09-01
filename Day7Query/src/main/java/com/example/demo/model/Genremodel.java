package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="Genre")
public class Genremodel {
	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
private int id;
private String Book;
private String Genre;
private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBook() {
	return Book;
}
public void setBook(String book) {
	Book = book;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
}
