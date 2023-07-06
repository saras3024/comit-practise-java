package org.comit.practise._01_practise._04_while_loop;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		// Write a program in Java that reads an integer from the keyboard 
		//and makes the sum of the following 100 numbers, showing the result on the screen.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  a number:");
		int num = input.nextInt();
		
		int i = num + 1;
		int sum = 0 ;
		while(i <= (100 + num))
		{
			sum = sum + i;
			i++;
			
		}
		
		
		int k = 0, l = 0;
		for (int j= 1; j<= 5; j++)
		{
			k++;
			System.out.println(k);
		
			++l;
			System.out.println(l);
		}
			
		System.out.println(sum);
		
		input.close();
	}

}
