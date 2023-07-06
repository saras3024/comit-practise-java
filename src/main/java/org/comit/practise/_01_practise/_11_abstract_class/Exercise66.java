package org.comit.practise._01_practise._11_abstract_class;

/* Write a Java program to create an abstract class Animal with an abstract method called sound(). 
 * Create subclasses Lion and Tiger that extend the Animal class 
 * and implement the sound() method to make a specific sound for each animal. */

abstract class Animal{
	
	abstract public void sound();
	
	public void hunt() {
		System.out.println("Animals eat by hunting");
	}
}

class Lion extends Animal{

	@Override
	public void sound() {
		System.out.println("Lion's sound is: roar ");
	}
	
	public void print() {
		System.out.println("Print : test");
	}
}

class Tiger extends Animal{

	@Override
	public void sound() {
		System.out.println("Tiger's sound is: growl");
		
	}
	
}

public class Exercise66 {

	public static void main(String[] args) {
		
		Animal lion = new Lion();
		Animal tiger = new Tiger();
		
		lion.sound();
		tiger.sound();
		((Lion)lion).print();
		lion.hunt();
		
		//Animal ani = new Animal(); // cannot instantiate Animal class . It is abstract
		

	}

}
