package org.comit.practise._01_practise._13_exceptions;

import java.util.Scanner;

/* Write a Java program that loops over an array of integers
 *  and throws an exception if any number is negative.
 *   The exception must be cough, and an error message displayed.  */

public class Exercise72 {

	public static void main(String[] args) throws HelloException {

		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Enter howmany elements do you want in the array");
			int number = input.nextInt();
			
			int[] array = new int[number];
			
			for (int i = 0; i < array.length; ++i) {

				System.out.println("Enter the element number " + (i+1));
				array[i] = input.nextInt();
			}
			
			for( int temp : array) {
				if(temp < 0) {
					throw new HelloException();
				}
				
			}
			System.out.println("The array doesnot have negative elements");
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			}
		  catch (HelloException e) {
			e.printStackTrace();
			System.out.println("The array contains negative number");
			}


	}

}
