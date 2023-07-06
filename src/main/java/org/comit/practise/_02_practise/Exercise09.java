package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to copy one array list into another. */

public class Exercise09 {

	public static void main(String[] args) {


		List <String> names = new ArrayList<>();
		List <String> namesNew = new ArrayList<>();
		
		
		names.add("Jas");
		names.add("Saras");
		names.add("Tarun");
		names.add("Sakthi");
		
		System.out.println(names);
		System.out.println();
		for(int i = 0; i < names.size(); ++i) {
			String s = names.get(i);
			namesNew.add(s);
		}
		System.out.println(namesNew);
		

	}

}
