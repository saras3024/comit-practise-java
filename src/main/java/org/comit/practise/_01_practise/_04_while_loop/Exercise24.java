package org.comit.practise._01_practise._04_while_loop;

public class Exercise24 {

	public static void main(String[] args) {
		// Write a program in Java that prints 200 times the word "Hello."  Note: in the source code that you write, you must only enter the word "Hello."
		
		String output = "Hello";
		
		int i = 1;
		
		while(i <= 200)
		{
			System.out.println(i + ":" + output);
			i++;
		}
	}

}
