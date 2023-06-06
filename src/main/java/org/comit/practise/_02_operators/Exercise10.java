package org.comit.practise._02_operators;

public class Exercise10 {

	public static void main(String[] args) {
		// Write a Java program that, given the following variable, prints out the sum of its digits.
		 // int a = 25;
		   //  Print out: 7
		
		int a = 25;
		int b = 25/10;
		int c= 25%10;
		int d = b+c;
		
		System.out.println(d);
		System.out.println("The value of sum of the digits in " + a + " is : " + d);
		
		
		int i = 6789;
		int rem;
		int sum = 0;
		String myChar = "";
		
		while(i>0)
		{
			rem = i % 10;
			i = i/10;
			
			sum = sum + rem;
			myChar = myChar + " + " + rem;
			
		}		
		
		myChar = myChar.substring(2);
		System.out.println("Sum of " + myChar + " is = " + sum);
		
	}

}
