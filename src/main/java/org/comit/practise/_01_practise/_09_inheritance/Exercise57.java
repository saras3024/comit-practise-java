package org.comit.practise._01_practise._09_inheritance;

/*  Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
 *  Create two subclasses, Bird and Cat. 
 * Override the Sound() method in each subclass to make a specific sound for each animal.*/

class Animal{
	
	String name;

	Animal(String name) {
		super();
		this.name = name;
		System.out.println(this.name );
	}
	
	void sound() {
		System.out.println("diaplaying animal sound .");
	}
	
}

class Bird extends Animal{
	
	String name;

	Bird(String name){
		super("child constructor Bird, calling parent Animal constructor using super keyword");
		this.name = name;
		System.out.println(this.name + " -  parameterised  child1 constructor");
	}
	
	@Override
	void sound() {
		//super.sound();
		System.out.println("displaying " + this.name +" sound.");
	}
	
}

class Cat extends Animal{
	int number;
	
	public Cat(int number) {
		super("Passing parameter from cat(child)class");
		this.number = number;
		System.out.println("Total number of cats: " + this.number);
}
	
	
	@Override
	public String toString() {
		return "cat [number=" + number + ", name=" + name + "]";
	}
}


public class Exercise57 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Passing Parent parameter");
		Bird b1 = new Bird("Parrot");
		b1.sound();
		Cat c1 = new Cat(10);
		System.out.println(c1);
	}
}
