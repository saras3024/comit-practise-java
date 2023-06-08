package org.comit.practise._04_while_loop;
import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		/* Write a Java program that declares an integer variable B and assigns it a value.
		   It then displays a message indicating whether the value of B is positive or negative.
		   We will consider 0 as positive. If, for example, B = 1, the output will be 1 is positive.
		   If, for example, B = -1, the output will be: -1 is negative. */
		
		/*System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		input.nextLine();
		System.out.println("Enter a name");
		String name = input.nextLine();
		System.out.println(name);
		System.out.println("Enter a number");
		int c = input.nextInt();
		System.out.println(c);
		
		System.out.println("The name is :" + name + " and the number is :" + b);
		
		
		
		input.close();
		*/
		
		
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		
		if(b >= 0)
			System.out.println(b + " is a positive number");
		else
			System.out.println(b + " is a negative number");
		input.close();
	}

}
