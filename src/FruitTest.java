package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class FruitTest {
	  String[] fruits;
		@Test
		void test() {
			
			HashMap<String,ArrayList<String>> favouritefruit = new HashMap<>();
			
			fruits= new String[] {"Mango","Kiwi","Guava"};
			favouritefruit.put("Pallavi", new ArrayList<String>(Arrays.asList(fruits)));
			fruits= new String[] {"Muskmealon","Custerdapple","Watermealon"};
			favouritefruit.put("Naveena", new ArrayList<String>(Arrays.asList(fruits)));
			
			for (Entry<String, ArrayList<String>> entry : favouritefruit.entrySet()) {
				System.out.println("Key= "+entry.getKey()+ ",value = "+entry.getValue());
				
			}
		}
	}

