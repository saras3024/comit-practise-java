package org.comit.practise._08_oop;

 class Rectangle {
	/* Exercise 49
	 * Write a Java program to create a class called "Rectangle" with width and height attributes. 
	 * Create a parameterized constructor and two methods that find the area and perimeter of the rectangle. 
	 * Create an object of “Rectangle” and display the area and perimeter. */
	
	double width;
	double height;
	
	

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
	double perimeter = 2 * (width +height);
		return perimeter;
	}

 }
public class MyClassExercise49{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(25.36, 15.25);
		System.out.printf("The area of the rectangle is : %.2f.%nThe perimeter of the rectangle is : %.2f.%n", rec.area(),rec.perimeter());;
		
	}

}
 
