package org.comit.practise._01_practise._13_exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int num = 0;
		int answer = 0;
		int b = 5;
		
		try(Scanner scan = new Scanner(System.in)){
			while(num<=0) {
				try {					
					System.out.println("Please input a number");
					
					String input = scan.nextLine();
					
					num = Integer.valueOf(input);
					System.out.println("num value is" + num);

					
					if(num<=0) {
					throw new HelloException();
				}
				
				answer = b/num;
			}catch(HelloException | NullPointerException | NumberFormatException | ArithmeticException e) {
				System.out.println("num is" + num);
				e.printStackTrace();
			}
	}
			System.out.println("Answer is : " + answer);
	}
}
}
