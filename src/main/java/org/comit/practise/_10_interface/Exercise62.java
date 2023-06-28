package org.comit.practise._10_interface;

/* Write a Java program to create an interface NewShape with the getArea() method.
 *  Create three classes, NewSquare, NewCircle, and NewTriangle, implementing the NewShape interface. 
 *  Implement the getArea() method for each of the three classes. */

interface NewShape{
	double PI = Math.PI;   //  By default the variable is public, static and final  
	void getArea();			// By default all the methods in interfaces are public and abstract
}

class NewSquare implements NewShape{
	
	@Override
	public void getArea() {
		double side = 2.5;
		double area = side * side;
		System.out.println("The area of the square is : " + area);
	}
}

class NewCircle implements NewShape{
	double area;
	@Override
	public void getArea() {
		double radius = 6.4;
		this.area = NewShape.PI * radius * radius;
		System.out.printf("The area of the circle is : %.2f%n",this.area);
	}
}

class NewTraingle implements NewShape{

	@Override
	public void getArea() {
		double base = 2.5;
		double height = 5;
		double area = 0.5 * base * height;
		System.out.println("The area of the triangle is : " + area);
		
	}
	
}

public class Exercise62 {

	public static void main(String[] args) {
		NewCircle newcircle = new NewCircle();
		NewSquare newsquare = new NewSquare();
		NewTraingle newtriangle = new NewTraingle();
		
		newsquare.getArea();
		newcircle.getArea();
		newtriangle.getArea();

	}

}
