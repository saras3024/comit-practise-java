package org.comit.practise._02_operators;

public class Exercise08 {

	public static void main(String[] args) {
		//Write a Java program to print out the values of the following expressions:
		
		double a = (double)(101+0)/3;
		
		double b = 3.0e-6 * 10_000_000.1;
		
		boolean c = true && true;
		
		boolean d = false && true;
		
		boolean e = (false && false)||(true && true);
		
		boolean f = (false && false) &&(true && true);
				

		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
		System.out.println("The value of c is:" + c);
		System.out.println("The value of d is:" + d);
		System.out.println("The value of e is:" + e);
		
		
		

	}

}
