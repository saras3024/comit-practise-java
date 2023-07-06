package org.comit.practise._01_practise._06_array;

import java.util.Arrays;

public class Exercise35a {

	public static void main(String[] args) {
		// Write a Java program to reverse the array in question 30
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int[] newArray = new int[array.length];
		int j = 0;
		
		for(int i = array.length - 1; i >= 0 ; i--)
		{
			newArray[j] = array[i];
			j = j + 1;
		}
		System.out.print("The reverse array is : " );
		System.out.println(Arrays.toString(newArray));
		

	}

}
