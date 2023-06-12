package org.comit.practise._06_array;

import java.util.Arrays;

public class Exercise32a {

	public static void main(String[] args) {
		//Write a Java program to test if the array in question 30 contains the value 5.
		//Print out a message indicating if the value was found.
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		Arrays.sort(array);
		System.out.print("The sorted array is : " );
		
		System.out.println(Arrays.toString(array));
		int foundIndex = Arrays.binarySearch(array,5);
		
		if(foundIndex > 0)
			System.out.println("The value is found at index : " + foundIndex);
		else
			System.out.println("The value is not found in the array");
		
		
	}

}
