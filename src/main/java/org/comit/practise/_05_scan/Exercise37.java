package org.comit.practise._05_scan;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		
		/* Write a program that asks for a numerical password and allows three attempts.
		If the user enters the correct password, it shows "Correct!" And run any program after the message.
		Otherwise, the program should display "Wrong password." Then finish the program immediately. */
		/* Input and Hint for the password */
		System.out.println("*** To use the following application you must crack the numeric password ***  \r\n \r\n" + 
		"I give you three hint for the password!!! \r\n\r\n" +
		"Hint 1 : Password is a 8 digit numeric in the format of 'ddmmyyyy' \r\n" +
		"Hint 1 : Month is half of Date and the second digit of the date must be twice of first digit \r\n" +
		"Hint 3 : Last leap year of 20th Century. \r\n\r\n" +
		"Guess the password now.......... \r\n");
		
		int attempt = 3;
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= attempt; i++)
		{
			int userPassword = input.nextInt();
			int date = 24121996;
			int remainingAttempt = attempt - i;
			if(userPassword == date)
			{
				System.out.println("You are a CRACKER!!! You can now use the application!!! \r\n");
				Exercise34 obj = new Exercise34();
				
				obj.calculator();
			}
			else
				System.out.println("OOPS!!! Password is wrong. You have " + remainingAttempt +" attempts now \r\n");
		}		
		input.close();	
	}
}