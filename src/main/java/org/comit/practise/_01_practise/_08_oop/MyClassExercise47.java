package org.comit.practise._01_practise._08_oop;



class Person  {
	
	/* Exercise47
	 * Write a Java program to create a class called "Person" with a name and age attribute. 
	Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age. */
	

	int age;
	String name;

	protected Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	protected void display()
	{
		System.out.printf("The person name is : %s %nThe person age is : %d %n", name, age);
	}


 }
public class MyClassExercise47{
	public static void main(String[] args) {
		Person per1 = new Person(25, "Babu");
		Person per2 = new Person(30,"Jeeva");
		
		per1.display();
		per2.display();
		
		
		
		
	}

}

