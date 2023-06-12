package org.comit.practise._06_array;

public class Exercise31a {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of the previous array elements. Print out the average value.

		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int len = array.length;
		System.out.println("Total number of elements in the array is : " + len);
		double sum = 0;
		for(int i = 0; i< len; i++)
		{
			sum = sum + array[i];
		}
		System.out.println("The sum of the values in the array is : " + sum);
		
		double average = sum / len;
		System.out.println("The average of the array element is : " + average);
		
	}

}
