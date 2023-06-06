package org.comit.practise._04_while_loop;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		// Write a program in Java that reads two numbers from the keyboard and says which is the largest and which is the smallest.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		System.out.println("Enter second number");
		double num2 = input.nextDouble();
		
		if(num1 > num2)
		{
			System.out.println(num1 + " is bigger than " + num2);
		}
		else
			System.out.println(num2 + " is bigger than " + num1);
		
		
		input.close();

	}

}
