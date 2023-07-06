package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Write a Java program to search for an element in an array list. */

public class Exercise07 {

	public static void main(String[] args) {
		
		List<String> rolls = new ArrayList<>() ;
		
		rolls.add("Doctor");
		rolls.add("Researcher");
		rolls.add("Astronaut");
		rolls.add("Palenthologist");
		rolls.add("Scientist");

		try(Scanner input = new Scanner(System.in)){
			
			try {
				System.out.println("Enter the roll you want to search");
				String userInput = input.nextLine();
				if(!(rolls.contains(userInput))) {
				
					throw new Exception("Roll not found");
				}
				else System.out.println("Roll found out");
				}
		
				catch(Exception e){
					e.printStackTrace();
					e.getMessage();
				}
				
			
		}
		

	}

}
