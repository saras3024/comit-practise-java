package org.comit.practise._01_practise._02_operators;

   //Write a Java program that, given the radius of a circle, calculates and prints out the area and perimeter of the circle.
   //double radius = 7.5;

public class Exercise12 {
	
	public static void main(String[] args)
	{
		double r = 7.5;
	    final double PI = 3.14;
		
		double areaOfTheCircle = PI * r * r;
		double perimeterOfTheCircle = 2 * PI * r;
		
		System.out.println("Area:" + areaOfTheCircle);
		System.out.println("Perimeter:" + perimeterOfTheCircle );
	}
}
