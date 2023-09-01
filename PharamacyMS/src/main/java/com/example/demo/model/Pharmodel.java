package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PharmDetails")
public class Pharmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int batchId;
	private String drugName;
	@Column(name="DrugType")
	private String medType;
	private int price;
	private String date;
	private int rackNo;
	private int shelfNo;
	//One to One(Billdetails)
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="batch_ID")
	private Billmod bill;
	//One to Many(Patient Details)
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkid", referencedColumnName = "batchId")
	private List<Custmod> customer;
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getMedType() {
		return medType;
	}
	public void setMedType(String medType) {
		this.medType = medType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRackNo() {
		return rackNo;
	}
	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}
	public int getShelfNo() {
		return shelfNo;
	}
	public void setShelfNo(int shelfNo) {
		this.shelfNo = shelfNo;
	}
	public Billmod getBill() {
		return bill;
	}
	public void setBill(Billmod bill) {
		this.bill = bill;
	}
	public List<Custmod> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Custmod> customer) {
		this.customer = customer;
	}


}

