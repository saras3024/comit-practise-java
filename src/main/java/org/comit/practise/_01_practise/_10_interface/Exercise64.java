package org.comit.practise._01_practise._10_interface;

/* Write a Java program to create an interface Flyable with a method called fly(). 
 * Create three classes, Spacecraft, Airplane, and Helicopter, implementing the Flyable interface. 
 * Implement the fly() method for each of the three classes. */

interface Flyable{
	void fly();
}

class SpaceCraft implements Flyable{

	@Override
	public void fly() {
		System.out.println("spacecraft fly faster than Airplane and Helicopter");
	}
	
}


class Airplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("Airplane fly faster than Helicopter but not Spacecraft");
	}
}


class Helicopter implements Flyable{

	@Override
	public void fly() {
		System.out.println("Helicopter is slower than Airplane");
	}
}

public class Exercise64 {

	public static void main(String[] args) {
		SpaceCraft spacecraft = new SpaceCraft();
		spacecraft.fly();
		Airplane airplane = new Airplane();
		airplane.fly();
		Helicopter helicopter = new Helicopter();
		helicopter.fly();
	}

}
