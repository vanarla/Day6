package com.capgemini.day6.domain;

import java.util.Objects;

public class Laptop {

	


	String company;
	String model;
	String OperatingSystem;
	String processor;
	public Laptop() {
		super();
		
	}
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		OperatingSystem = operatingSystem;
		this.processor = processor;
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
	public String getOperatingSystem() {
		return OperatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + OperatingSystem
				+ ", processor=" + processor + "]";
	
    
	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
	 
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Laptop laptop = (Laptop) obj;
		return this.model==laptop.model && this.company==laptop.company;
	}

	
	
	
	
}
