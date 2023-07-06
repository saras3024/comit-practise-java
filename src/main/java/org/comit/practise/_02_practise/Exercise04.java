package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to retrieve an element (at a specified index) from a given array list. */

public class Exercise04 {

	public static void main(String[] args) {
		
		List<Float> nums = new ArrayList<>();
		
		nums.add((float) 14.25);
		nums.add(1, (float) 45);
		nums.add((float) 0);
		nums.add((float) 1234567891);
		
		//System.out.println(nums);
		System.out.println(nums.get(1));;
		
		List<Double> num = new ArrayList<>();
		
		num.add(null);
		num.add(1, (double) 0);
		//System.out.println(num);

	}

}
