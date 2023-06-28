package org.comit.practise._09_inheritance;

import java.util.Scanner;

/*  Write a Java program to create a base class Shape with a method called calculateArea().
 *  Create three subclasses: Circle, Rectangle, and Triangle. 
 *  Override the calculateArea() method in each subclass to calculate and return the shape's area.*/

class Shape{
	Scanner input = new Scanner(System.in);
	double area;
	
	public double calculateArea() {
		return area; 
	}
}

class Circle extends Shape{
	final double PI = Math.PI;
	double area;
	
	@Override
	public double calculateArea() {
		System.out.println("Enter the radius of the circle");
		double radius = input.nextDouble();
		area = PI * radius * radius;
		return area;
	}
	
}

class Rectangle extends Shape{
	
	double area;
	
	@Override
	public double calculateArea() {
		System.out.println("Enter the length of the rectangle");
		double length = input.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double breadth = input.nextDouble();
		area = length * breadth;
		return area;
	}
}

class Triangle extends Shape{
	
	double area;

	@Override
	public double calculateArea() {
		System.out.println("Enter the base of the triangle");
		double base = input.nextDouble();
		System.out.println("Enter the height of the triangle");
		double height = input.nextDouble();
		area = 0.5 * base * height;
		input.close();
		return area;
	}
	
}

public class Exercise58 {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		System.out.printf("Area of the circle is: %.2f%n", circle.calculateArea());
		System.out.println("Area of the rectangle is: " + rectangle.calculateArea());
		System.out.println("Area of the triangle is: " + triangle.calculateArea());
	}

}
