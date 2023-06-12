package org.comit.practise._06_array;

public class Exercise36a {

	public static void main(String[] args) {
		// Write a Java program to find the number of even and odd integers in the array in question 30
		
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int evenCount = 0, oddCount = 0;
		
		for(int i = array.length - 1; i >= 0 ; i--)
		{
			if ((array[i] % 2) == 0) evenCount = evenCount + 1; 
			else oddCount = oddCount + 1; 
		}
		System.out.println("Total even number count is " + evenCount + "\r\n" + 
						   "Total odd number count is " + oddCount); 

	}

}
