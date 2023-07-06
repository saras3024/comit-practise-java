package org.comit.practise._01_practise._13_exceptions;
/* Write a Java program to create a method that takes an integer as a parameter 
 * and throws an exception if the number is odd. 
 * The method caller must catch the exception and display an error message.  */


	public class Exercise70 {
	
	public static void checkOdd(int num) throws Exception {
			if(num%2 != 0)
				throw new Exception(String.format("The number %d is odd", num));
				//throw new Exception("odd");
		}
		
	public static void main(String[] args) {
		try {
			checkOdd(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	}
