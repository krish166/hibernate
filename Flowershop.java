package com.krish;

import javax.persistence.Embeddable;

@Embeddable
public class Flowershop {
	
	private String fname;
    private String sales;
    
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	
	
}
