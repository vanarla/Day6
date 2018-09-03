package com.capgemini.day6.domain;

import java.util.Objects;

public class Television {

	String company;
	String type;
	boolean threedEnabled;
	double price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, boolean threedEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threedEnabled = threedEnabled;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getThreedEnabled() {
		return threedEnabled;
	}
	public void setThreedEnabled(boolean threedEnabled) {
		this.threedEnabled = threedEnabled;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", 3denabled=" + threedEnabled
				+ ", price=" + price + "]";
	
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(company,type,threedEnabled,price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Television television = (Television) obj;
		return this.company==television.company && this.type==television.type && this.price==television.price;
	}

	

	
}
