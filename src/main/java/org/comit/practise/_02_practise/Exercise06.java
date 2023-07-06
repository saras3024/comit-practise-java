package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

/* Write a Java program to remove the third element from an array list. */

public class Exercise06 {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		
		num.add((int) 25.25);
		num.add(12);
		num.add(null);
		num.add(3,100);
		
		System.out.println(num);
		
		num.remove(null);
		
		System.out.println(num);

	}

}
