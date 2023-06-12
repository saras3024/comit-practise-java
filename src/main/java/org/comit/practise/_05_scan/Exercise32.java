package org.comit.practise._05_scan;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		/* Make the program in JAVA such that given as a worker's salary, apply a 15% increase if your salary is less than $ 1000 and 12% otherwise. 
		Print the new salary of the worker. Fact: SUE (variable of a real type that represents the salary of the worker). */
		
		double newSalary;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary = input.nextDouble();
		
		if(salary <= 1000)
		{
			newSalary =  salary + (salary * 0.15);
		}
		else
			newSalary =  salary + (salary * 0.12);
		
		input.close();
		
		System.out.println("your old salary : " + salary);
		System.out.println("your new salary : " + newSalary );
	}

}
