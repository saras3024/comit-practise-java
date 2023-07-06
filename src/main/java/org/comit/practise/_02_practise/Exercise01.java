package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to create an array list, add some colours (strings) and print out the collection. */

public class Exercise01 {

	public static void main(String[] args) {
		
		List<String> colours = new ArrayList<>() ;
		
		colours.add("green");
		colours.add("red");
		colours.add("blue");
		colours.add("black");
		colours.add("white");
		
		for(String temp : colours) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		for(int i = 0; i < colours.size(); ++i) {
			System.out.println(colours.get(i));
		}
		
		
		
		

	}

}
