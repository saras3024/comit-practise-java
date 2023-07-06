package org.comit.practise._01_practise._03_flow_control;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Write a Java program that, given a year, prints out whether it is a leap year or not.
		
		System.out.println("Enter a year");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
		{
			System.out.println("The given year " + year + " is a leap year.");
		}
		else
			
			System.out.println("The given year " + year + " is not a leap year.");
		
		input.close();
	}

}
