package org.comit.practise._06_array;

import java.util.Arrays;

public class Exercise34a {

	public static void main(String[] args) {
		// Write a Java program to find the maximum and minimum value in the array in question 30.


		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		Arrays.sort(array);
		System.out.print("The sorted array is : " );
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("The maximum value in the array is : " + array[(array.length) - 1]);
		System.out.println("The minimum value in the array is : " + array[0]);
	}

}
