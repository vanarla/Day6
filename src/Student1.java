package com.capgemini.day6.tests;

public class Student1 implements Comparable<Student1>{
	
	private String name;
	private int rollno;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(String name,int rollno) {
		super();
		this.name = name;
		this.setRollno(rollno);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int compareTo(Student1 s1) {
		int result = this.name.compareTo(s1.name);
		if(result == 0)
			return Integer.compare(this.rollno, s1.rollno);
		return result;
	}

	@Override
	public String toString() {

		return "name=" + name ;
	}
	
	
	
	


	

}
