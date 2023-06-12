package org.comit.practise._07_strings;

public class Exercise41 {

	public static void main(String[] args) {
		// Write a Java program to compare the following two strings ignoring case considerations.
		   
		String str1 = "I love coding in Java";
		String str2 = "I Love Coding In Java";
		
		int compare = str1.compareToIgnoreCase(str2);
		if(compare == 0)
			System.out.println("Both the strings are same");
		else
			System.out.println("Both the strings are  not same");


	}

}
