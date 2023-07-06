package org.comit.practise._01_practise._13_exceptions;


import java.util.Scanner;

/* Write a Java program that reads an array of integers from the user 
 * and throws an exception if any numbers are duplicates. */

public class Exercise73 {

	public static void main(String[] args)  {

		try(Scanner input = new  Scanner(System.in)){
			System.out.println("Enter howmany elements do you want in the array");
			int number = input.nextInt();
			
			int[] array = new int[number];
			
			for (int i = 0; i < array.length; ++i) {

				System.out.println("Enter the element number " + (i+1));
				array[i] = input.nextInt();
			}
			
			for(int i = 0; i < array.length-1; ++i) {
				for (int j= i + 1; j< array.length; ++j) {
					if(array[i] == array[j]) {
						throw new HelloException();
					}
				}
		}System.out.println("Array has no duplicate numbers");
		
		
		}catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("Array size cannot be negative");
			}
		  catch (HelloException e) {
			e.printStackTrace();
			System.out.println("The array contains duplicate number");
			}

	}

}
