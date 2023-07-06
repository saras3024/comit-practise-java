package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to update an array element by the given element. */

public class Exercise05 {

	public static void main(String[] args) {
		
		List <String> names = new ArrayList<>();
		
		names.add(null);
		names.add(1, "Tarun");
		names.clear();
		
		System.out.println(names);
		
		names.add("Jas");
		names.add("Sara");
		names.set(1, "Sakthi");
		
		System.out.println(names);

	}

}
