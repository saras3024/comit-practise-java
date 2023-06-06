package org.comit.practise._03_flow_control;

public class Exercise16 {

	public static void main(String[] args) {
		// Write a Java program for the following scenario: A company decides to give a bonus of 5% to the employees if their years of service are more than 5 years. So given a number of years of service and a salary, print out the bonus.
		
		
		int years = 7;
		double salary = 65_000;
		double bonus = 0;
		
		bonus =	(years > 5) ?  salary * 0.05 : 0 ;
		System.out.println("The bonus is : " + bonus );

	}

}
