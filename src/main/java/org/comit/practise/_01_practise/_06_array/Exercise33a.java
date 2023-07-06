package org.comit.practise._01_practise._06_array;

public class Exercise33a {

	public static void main(String[] args) {
		// Write a Java program to find the index of value 4 in the array in question 30.
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] == 4)
			{
				System.out.println("The index of value 4 in the array is : " + i);
			}
				
			
		}
		
	}

}
