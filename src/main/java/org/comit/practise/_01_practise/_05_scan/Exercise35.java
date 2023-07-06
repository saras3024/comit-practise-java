package org.comit.practise._01_practise._05_scan;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) {
		/* Calculate the salary increase for a group of employees of a company considering the following criteria:
		If the salary is less than $ 1,000.00: Increase by 15% If the salary is greater than or equal to $ 1,000.00: Increase by 12% 
		The program must do The following: - Save the new salaries in the arrangement - Calculate the payroll - 
		Print the salaries from the settlement. */
      
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of hours worked");
		double noOfHours = input.nextDouble();
		
		System.out.println("Enter the hourly wage");
		double hourlyWage = input.nextDouble();
		
		
		
		
		double salary = noOfHours * hourlyWage;
		
		if(salary >= 1000)
		{
			salary = salary + (salary * 0.12);
			System.out.println("Your new salary is :" + salary);
		}
		else
			salary = salary + (salary * 0.15);
			System.out.println("Your new salary is :" + salary);
		input.close();
		
		
	}

}
