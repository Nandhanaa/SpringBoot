package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

public class transmodel {
	@Id
@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private int carid;
	private String name;
	@Transient
	private String model;
	private int custid;
	private int custname;
public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getCustname() {
		return custname;
	}
	public void setCustname(int custname) {
		this.custname = custname;
	}


}
