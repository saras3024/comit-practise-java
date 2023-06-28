package org.comit.practise._09_inheritance;

/* Write a Java program to create a class called Rectangle with private instance variables length and width.
 *  Provide public getter and setter methods to access and modify these variables. */

class Rectangle1{
	
	private double length;
	private double width;
	
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
}

public class Exercise61 {

	public static void main(String[] args) {
		
		Rectangle1 rectangle = new Rectangle1();
		
		rectangle.setLength(12.25);
		rectangle.setWidth(2.35);
		
		System.out.printf("The length is %.2f, the width is %.2f%n",
				rectangle.getLength(),rectangle.getWidth());

	}

}
