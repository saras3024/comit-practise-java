package org.comit.practise._01_practise._13_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* Write a Java program to create a method that opens a file 
 * and throws an exception if the file is not found. 
 * The method caller must catch the exception and display an error message.  */


public class Exercise71 {
	
	static void process() throws FileNotFoundException
	{
		BufferedReader br;
		br = File.open("testfile1.txt");
	}
/*static FileReader process() throws FileNotFoundException {
		
		return new FileReader("hello.txt");
	}*/
	
	
	public static void main(String[] args){

		try {
		process();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
