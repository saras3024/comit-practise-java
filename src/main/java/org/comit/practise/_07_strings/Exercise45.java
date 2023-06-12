package org.comit.practise._07_strings;

public class Exercise45 {

	public static void main(String[] args) {
		// Write a Java program to check whether the following string has duplicate characters.
        
		String str = "I love coding in Java";
		boolean appear = false;;
		
		for(int i = 0; i < str.length(); i++)
		{
			for (int j= i + 1; j< str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					 appear = true;					
				}
		}
	}
		if(appear == true)
			System.out.println("The string has duplicate characters");
		else
			System.out.println("The stringdoes not have duplicate characters");
}
}
