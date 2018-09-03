package com.capgemini.day6.domain;

import java.util.Objects;

public class Cellphone {
	
	String company;
	String model;
	String description;
	String operatingSystem;
	double price;
	public Cellphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cellphone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", description=" + description+", operatingSystem=" +operatingSystem
				+ ", price=" + price + "]";
	
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Cellphone cellphone = (Cellphone) obj;
		return this.company==cellphone.company&& this.model==cellphone.model && this.operatingSystem==cellphone.operatingSystem;
	}

	
	
	
	
	
	
}
