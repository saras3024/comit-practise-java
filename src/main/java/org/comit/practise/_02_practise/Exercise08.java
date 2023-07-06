package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Write a Java program to sort a given array list. */

public class Exercise08 {

	public static void main(String[] args) {

		List <String> names = new ArrayList<>();
		
		names.add("Jas");
		names.add("Saras");
		names.add("Tarun");
		names.add("Sakthi");
		
		names.sort(null);
		System.out.println(names);
		
		List <Integer> num = new ArrayList<>();
		
		num.add(12);
		num.add(45);
		num.add(5);
		num.add(59);
		num.add(13);
		
		num.sort(null);  //I don't know why passing null value 
		System.out.println(num);
		
		Collections.sort(num);   //it's a Collections class not Collection interface
		System.out.println(num);
		
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
		
		

	}

}
