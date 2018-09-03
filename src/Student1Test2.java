package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class Student1Test2 {

	@Test
	void test() {

		TreeSet<Student1> names=new TreeSet<>();
		
		assertEquals(true, names.add(new Student1("Pallavi",1)));
		assertEquals(true, names.add(new Student1("Pall",2)));
		assertEquals(true, names.add(new Student1("P",3)));
		assertEquals(true, names.add(new Student1("Palla",4)));
		


		
		Iterator<Student1> itr = names.iterator();
		assertEquals("name=P",itr.next().toString());
	}

}
