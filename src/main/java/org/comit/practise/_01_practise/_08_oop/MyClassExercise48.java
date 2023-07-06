package org.comit.practise._01_practise._08_oop;

class Dog {
	
	/* Exercise48
	 *  Write a Java program to create a class called "Dog" with a name and breed attribute. 
	Create two instances of the "Dog" class, set their attributes using the constructor 
	and modify the attributes using the setter methods and print the updated values. */
	
	String name;
	String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void dispaly()
	{
		System.out.printf("The dog name is : %s. %nThe breed is :%s. %n", name,breed);
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class MyClassExercise48{
	public static void main(String[] args) {
		
		Dog d1 = new Dog("Winnie","German Shepherd");
		Dog d2 = new Dog("Sonny","Labrador");
		d1.dispaly();  
		d2.dispaly();
		d1.setName("Ziggy");
		d1.setBreed("Bull Dog");
		d2.setName("Jude");
		d2.setBreed("Fernch BullDog");
		
		d1.dispaly();
		d2.dispaly();
		
		Person1 obj = new Person1(4);
		
		
		
		

	}

}
