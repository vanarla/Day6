package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.Cellphone;
import com.capgemini.day6.domain.Laptop;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Television;

class Coll2Test {

	@Test
	void testLaptop() {
HashSet<Laptop> laptops = new HashSet<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		assertEquals(true,laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3")));
		assertEquals(false,laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3")));
		assertEquals(true,laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7")));
		
		//assertEquals(3, laptops.size());
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
			
		}
	}
	
	
	@Test
	void testCar()
	{
		HashSet<Car> cars=new HashSet<>();
		
		assertEquals(true,cars.add(new Car("Audi","AS345",2012,2450000)));
		assertEquals(true,cars.add(new Car("BMW","BH789",2016,3420000)));
		assertEquals(false,cars.add(new Car("BMW","BH789",2016,3420000)));
		assertEquals(true,cars.add(new Car("Hyundai","GF675",2000,150000)));
		
		assertEquals(3, cars.size());
		
		for (Car car : cars) {
			System.out.println(car);
			
		}
	}

	@Test
	void testCellphone()
	{
		HashSet<Cellphone> cellphones=new HashSet<>();
		
		assertEquals(true,cellphones.add(new Cellphone("Nokia","GF456","XYZ","Android",45000.0)));
		assertEquals(true,cellphones.add(new Cellphone("Samsung","JH7854","ABC","Android",34000.0)));
		assertEquals(false,cellphones.add(new Cellphone("Samsung","JH7854","ABC","Android",34000.0)));
		assertEquals(true,cellphones.add(new Cellphone("RedMi","GD742","LMN","Android",8000.0)));
		
		assertEquals(3, cellphones.size());
		
		for (Cellphone cellphone : cellphones) {
			System.out.println(cellphone);
		}
	}
	
	@Test
	void testTelevision()
	{
		HashSet<Television> televisions=new HashSet<>();
		
		assertEquals(true,televisions.add(new Television("LG","LCD",true,25000.0)));
		assertEquals(true,televisions.add(new Television("Samsung","LED",false,34000.0)));
		assertEquals(false,televisions.add(new Television("Samsung","LED",false,34000.0)));
		assertEquals(true,televisions.add(new Television("RedMi","LED",true,18000.0)));
		
		assertEquals(3, televisions.size());
		for (Television television : televisions) {
			System.out.println(television);
		}
	}
	
	@Test
	void testSchool()
	{
		HashSet<School> schools=new HashSet<>();
		
		assertEquals(true,schools.add(new School("KGPS","Hyderabad","Rangareddy",2)));
		assertEquals(true,schools.add(new School("RGJS","Chennai","pqrsw",4)));
		assertEquals(false,schools.add(new School("RGJS","Chennai","pqrsw",4)));
		assertEquals(true,schools.add(new School("KDES","Mumbai","xyzw",2)));
		
		assertEquals(3, schools.size());
		for (School school : schools) {
			System.out.println(school);
		}
	}

}

