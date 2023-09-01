package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Usermod {
	@Id
	@GeneratedValue(strategy = (GenerationType.IDENTITY))

	private long usid;
	private String name;
	private String email;
	private String pw;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkid", referencedColumnName = "usid")
	private List<Adressmod> address;

	public long getUsid() {
		return usid;
	}

	public void setUsid(long usid) {
		this.usid = usid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public List<Adressmod> getAddress() {
		return address;
	}

	public void setAddress(List<Adressmod> address) {
		this.address = address;
	}
}
