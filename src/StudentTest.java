package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Student;

class StudentTest {

	@Test
	void testStudentDetail() {

		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("Pallavi"));
		students.add(new Student("Bindu"));
		students.add(new Student("Swathi"));
		students.add(new Student("Naveena"));
		
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
