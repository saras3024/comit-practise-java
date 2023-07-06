package org.comit.practise._01_practise._12_enum;

/* Write a Java program to implement an enum called "Shape" 
 * with constants representing different geometric shapes. */

enum Shape{
	SQUARE(1,"all sides are equal"), RECTANGLE (2,"opposite sides are equal"), circle (3,"no sides");

	int number;
	String side;
	
	Shape(int number, String sides) {
		this.number = number;
		this.side = sides;
	}
	
	int getNumber() {
		return number;
	}
	
	String getSide() {
		return side;
	}
	
	String getAllDetails() {
		return number +(side);
	}
}


class ChooseShape{
	
	Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
}


public class Exercise68 {

	public static void main(String[] args) {
		
		ChooseShape shape = new ChooseShape();
		
		shape.setShape(Shape.SQUARE);
		
		System.out.println("The shape is : " + shape.getShape());
		System.out.println("The number is : " + shape.getShape().getNumber());
		System.out.println("The sides : " + shape.getShape().getSide());
		System.out.println(shape.getShape().getAllDetails());

	}

}
