package org.comit.practise._05_scan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise36 {

	public static void main(String[] args) {
		// Make a program that asks for the salary of N workers (first, you must ask how many workers there are) and print the one with the highest salary.
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of workers");
		int noOfWorkers = input.nextInt();
		
		double[] salary = new double[noOfWorkers];
		
		
		for(int i = 0; i < noOfWorkers; i++)
		{
			System.out.println("Enter the worker number " + (i + 1) + " salary : ");
			salary[i]= input.nextDouble(); 
		}
		
		//System.out.println("The workers salary are as follows: " + Arrays.toString(salary));
		
		/*for (double temp : salary)
		{
			System.out.println(temp);
		}*/
		
		for(int j = 0; j < noOfWorkers; j++)
		{
		System.out.println("worker number " + (j + 1) + " salary is : " + salary[j] );
		}
		
		Arrays.sort(salary);
		
		int arrayLength = salary.length;
		System.out.println("The highest salary is :" + salary[(arrayLength - 1)] );
		
		input.close();
  
	}

}



