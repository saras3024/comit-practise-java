package org.comit.practise._10_interface;

/* Write a Java program to create an Animal interface with a method called speak() 
 * that takes no arguments and returns void. 
 * Create a Dog class that implements Animal and overrides speak() to print "Dog is barking". */

interface Animal{
	void speak();
}

class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("Dog is barking");
	}
	
}

public class Exercise63 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.speak();

	}

}
