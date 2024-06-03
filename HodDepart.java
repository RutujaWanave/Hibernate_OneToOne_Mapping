package com.learn.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HodDepart
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private String name;
	private String profession;
	private int income;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public HodDepart(int no, String name, String profession, int income) {
		super();
		this.no = no;
		this.name = name;
		this.profession = profession;
		this.income = income;
	}
	public HodDepart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
