package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.capgemini.day6.domain.Car;

class CarTest {

	@Test
	void test() {
		
		TreeSet<Car> car=new TreeSet<>();
		
	
		
		assertEquals(true,car.add(new Car("BMW","BH789",2016,3420000)));
		assertEquals(true,car.add(new Car("Hyundai","GF675",2000,150000)));
		assertEquals(true,car.add(new Car("Audi","AS345",2012,2450000)));
		

		Iterator<Car> itr = car.iterator();
		assertEquals("make=Audi",itr.next().toString());
		assertEquals("make=BMW",itr.next().toString());
		assertEquals("make=Hyundai",itr.next().toString());
		
		
			
		}
	}


