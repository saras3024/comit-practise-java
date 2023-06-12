package org.comit.practise._06_array;

public class Exercise30a {

	public static void main(String[] args) {
		// Write a Java program to sum the values of the following array. Print out the sum. 
		 
		
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int len = array.length;
		int sum = 0;
		for(int i = 0; i< len; i++)
		{
			sum = sum + array[i];
		}
		System.out.println("The sum of the values in the array is : " + sum);
		
		

	}

}
