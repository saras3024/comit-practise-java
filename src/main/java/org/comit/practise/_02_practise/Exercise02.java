package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to iterate through all elements in an array list */

public class Exercise02 {

	public static void main(String[] args) {
		
		List<Double> nums = new ArrayList<>();
		
		nums.add(24.25);
		nums.add(98.26);
		nums.add(1, 12.25);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));			
		}
		
		

	}

}
