package org.comit.practise._01_practise._13_exceptions;

import java.util.Scanner;

/* Write a Java program to create a method that takes a string as input 
 * and throws an exception if the string does not contain vowels. */

public class Exercise74 {

	public static void main(String[] args)  {		
	try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Please enter a string");
			String check = input.nextLine();
		
			int len = check.length();
			
			boolean contains = false;
	
			for(int i = 0; i< len; ++i){
				if(check.charAt(i) == 'a' || check.charAt(i) == 'e' ||
				   check.charAt(i) == 'i' || check.charAt(i) == 'o' ||
				   check.charAt(i) ==  'u') {
					System.out.println(i);
					contains = true;
					break;
					}}
			try {
			if(!contains ) {
				throw new Exception(String.format("The string does not contains vowels"));
			}
			else System.out.println("String contains vowel");

		} catch (Exception e) {

			e.printStackTrace();
		}
			}
		}
}




/*	//String regex = "[aeiou]";
	for(int i = 0; i< len; ++i) {
		//if(check.compareTo("Sakthi") > 0) {	//(check.charAt(i)) == ('a' | 'e' | 'i' | 'o' | 'u')) {
		//if (check.charAt(i).matches("[aeiou]") == true){
		if (check.matches("[aeiou]") == true) */
