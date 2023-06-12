package org.comit.practise._07_strings;

public class Exercise42 {

	public static void main(String[] args) {
		// Write a Java program to get the index of all the alphabet characters in the following string.
		   
		String str = "The quick brown fox jumps over the lazy dog.";
		int ascii_Val = 0;
//		String newString = str.replace(" ","");
//		newString = newString.replace(".","");
//		System.out.println(newString);

		for(int i = 0; i < str.length(); i++) 
		{
			char myChar = str.charAt(i);
			if ((myChar != ' ') && (myChar != '.'))  
			{
				ascii_Val = (int) str.charAt(i);
				System.out.println(str.charAt(i) + " - " + ascii_Val);
			}
		}




	}

}
