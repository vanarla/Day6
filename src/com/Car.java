package com.capgemini.day6.domain;

import java.util.Objects;

import com.capgemini.day6.tests.Student1;

public class Car implements Comparable<Car>{

	String make;
	String model;
	int year;
	double price;
	public Car() {
		super();
		
	}
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(make);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Car car = (Car) obj;
		return this.make==car.make && this.model==car.model;
	}

	@Override
	public int compareTo(Car c1) {
		int result = this.make.compareTo(c1.make);
		
		return result;
	}
	
	
	
	
	@Override
	public String toString() {
		return "make=" + make;/*+ ", model=" + model + ", year=" + year
				+ ", price=" + price ;*/
	}
}
