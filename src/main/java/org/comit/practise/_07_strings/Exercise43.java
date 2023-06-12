package org.comit.practise._07_strings;

public class Exercise43 {

	public static void main(String[] args) {
		// Write a Java program to reverse the string in question 37
		
		String str = "I love coding in Java";
		String str_new = "";
		for (int i = str.length()-1; i >= 0; i--)
		{
			str_new = str_new + String.valueOf(str.charAt(i));
		}
		System.out.println(str_new);
	}

}
