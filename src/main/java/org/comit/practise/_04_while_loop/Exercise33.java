package org.comit.practise._04_while_loop;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		// Make a program that prints the 10 multiplication tables.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the multiplication table number");
		int number = input.nextInt();
		System.out.println("The" + number +"th table is:");
		for(int i = 1; i<=20; i++)
		{
			System.out.println(i +" * " + number +" = " +number * i);
		}
		input.close();

	}

}
