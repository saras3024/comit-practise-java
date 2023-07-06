package org.comit.practise._01_practise._07_strings;

public class Exercise46 {

	public static void main(String[] args) {
		// Write a Java program to check whether the character “z” is happy or not in the following string.
		//A character is happy when the same character appears to its left or right in a string.
		  
		String str = "azzlea";
		boolean appear = false;
		int position = str.indexOf("z");		
		appear = (str.charAt(position) == str.charAt(position + 1)) || (str.charAt(position) == str.charAt(position - 1));
	
		if(appear == true) 
			System.out.println("The character Z is happy");
		else
		 System.out.println("The character Z is not happy");
}
}
