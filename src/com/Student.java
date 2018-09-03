package com.capgemini.day6.domain;

import java.util.ArrayList;

public class Student {
	String name;

	public Student() {
		super();
		
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student Name: "+name;
	}

}
