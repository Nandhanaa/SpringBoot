package com.example.demo.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Studentmod {
	

		@Id
		@GeneratedValue(strategy=(GenerationType.IDENTITY))
		private int stuid;
		private String stuname;
		@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="address")
		private Addressmod stuadd;
		
		public int getStuid() {
			return stuid;
		}
		public void setStuid(int stuid) {
			this.stuid = stuid;
		}
		public String getStuname() {
			return stuname;
		}
		public void setStuname(String stuname) {
			this.stuname = stuname;
		}
		public Addressmod getStuadd() {
			return stuadd;
		}
		public void setStuadd(Addressmod stuadd) {
			this.stuadd = stuadd;
		}
		
	

}
