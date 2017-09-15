package com.krish;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manager {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerid;
	private String name;
	
	@Embedded
	private Flowershop fs;

	
	

	public Flowershop getFs() {
		return fs;
	}

	public void setFs(Flowershop fs) {
		this.fs = fs;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
