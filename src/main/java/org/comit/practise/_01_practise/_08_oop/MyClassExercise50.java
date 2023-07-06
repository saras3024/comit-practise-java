package org.comit.practise._01_practise._08_oop;

import java.util.Scanner;


 class Circle {
	
	/*Exercise 50
	 * Write a Java program to create a class called "Circle" with a radius attribute.
	 *  You can access and modify this attribute. Create methods to find the area and circumference of the circle. 
	 * Create an object of “Circle” and display the area and circumference. */
	
	double radius;
	double PI = 3.14;
	Scanner input = new Scanner(System.in);

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius() {
		System.out.println("Enter the new radius:");
		double radius = input.nextDouble();
		input.close();
		this.radius = radius;
	}
	
	public double areaOfTheCircle()
	{
		 double area = PI * radius * radius;
		return area;
	}
	public double circumferenceOfTheCircle()
	{
		double perimeter = 2 * PI * radius;
		return perimeter;
	}
	
	public void display() {
		System.out.println("The given radius is:" + radius);
	}
	
 }
 
public class MyClassExercise50{
	public static void main(String[] args) {
		Circle cir = new Circle(25.36);
		cir.display();
		System.out.printf("The area of the circle is : %.2f.%n"
				+ "The circumferenceOfTheCircle of the circle is : %.2f.%n", cir.areaOfTheCircle(),cir.circumferenceOfTheCircle());
		cir.setRadius();
		System.out.printf("The area of the circle is : %.2f.%n"
				+ "The circumferenceOfTheCircle of the circle is : %.2f.%n", cir.areaOfTheCircle(),cir.circumferenceOfTheCircle());
		
	}
	
}



