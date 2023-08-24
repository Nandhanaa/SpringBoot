package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Drug_Details")
public class Pharmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int batchId;
	private String drugName;
	@Column(name="DrugType")
	private String medType;
	private int Price;
	private String date;
	private int rackNo;
	private int shelfNo;
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
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
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

}

