package org.comit.practise._04_while_loop;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {
		// Write a program in Java that converts from Canadian dollars to US dollars. 
		//You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars. Use today’s exchange rate.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount in CAD");
		double amount = input.nextDouble();
		
		double usDollars = amount * 0.74613;
		System.out.println("The converted value of Canadian dollars - " + amount + " into US dollars is :" + usDollars);
		
		input.close();
		

	}

}
