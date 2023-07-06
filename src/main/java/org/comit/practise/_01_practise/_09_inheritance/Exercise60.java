package org.comit.practise._01_practise._09_inheritance;

/* Write a Java program to create a class called Person with private instance variables name, age and country.
 *  Provide public getter and setter methods to access and modify these variables.*/ 

class Person{
	
	private int age;
	private String name;
	private String country;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}


public class Exercise60 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Tarun");
		person.setAge(10);
		person.setCountry("Canada");
		
		System.out.printf("The person name is %s, the age is %d and the country is %s%n", 
				person.getName(),person.getAge(),person.getCountry());

	}

}
