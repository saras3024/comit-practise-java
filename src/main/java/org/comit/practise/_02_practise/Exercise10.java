package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Write a Java program to shuffle elements in an array list. */

public class Exercise10 {

	public static void main(String[] args) {
		

		List <String> names = new ArrayList<>();
		
		names.add("Jas");
		names.add("Saras");
		names.add("Tarun");
		names.add("Sakthi");
		names.add("Srisha");
		names.add("Meera");
		names.add("SriHarshini");
		names.add("Siddharth");
		
		
		System.out.println(names);
		
		Collections.shuffle(names);
		System.out.println(names);

	}

}
