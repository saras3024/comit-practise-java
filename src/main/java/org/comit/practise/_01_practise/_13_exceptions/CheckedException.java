package org.comit.practise._01_practise._13_exceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	void process() {
		
		//BufferedReader file = null ;
		
		try(BufferedReader  file = File.open("testfile.txt")) {
			
			
			String temp = null;
			while((temp =  File.read(file)) != null) {
				System.out.println(temp);// to open file
			
		} 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		 catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		CheckedException obj = new CheckedException();
		obj.process();

	}

}
