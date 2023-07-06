package org.comit.practise._01_practise._07_strings;

public class Exercise39 {

	public static void main(String[] args) {
		// Write a Java program to sum the character's ASCII codes of all the characters within the string in question 37.
		
		String str = "I love coding in Java";
		int sum = 0;
		int ascii_Val = 0;
		
		String newString = str.replace(" ","");
		System.out.println(newString);

		for(int i = 0; i < newString.length(); i++) 
		{
			ascii_Val = (int) newString.charAt(i);
			System.out.println(newString.charAt(i) + " - " + ascii_Val);
			sum = sum + ascii_Val;
		}
		System.out.println("Total ascii value = " + sum);

	}

}
