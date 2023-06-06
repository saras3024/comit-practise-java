package org.comit.practise._04_while_loop;

public class Exercise25 {

	public static void main(String[] args) {
		// Write a program in Java that prints the squares of the first 30 natural numbers on the screen.
		
		int i = 1;
		while(i <= 30)
		{
			System.out.println(i + " ^2 : " + (i * i));
			i++;
		}
	}

}
