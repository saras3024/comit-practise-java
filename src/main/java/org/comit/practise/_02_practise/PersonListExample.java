package org.comit.practise._02_practise;

import java.util.ArrayList;
import java.util.List;

public class PersonListExample {

	public static void main(String[] args) {


		List<Person> persons = new ArrayList<>();
		
		Person p1 = new Person(1, "Jas", 6);  // creating a new object and allocating memory and assigning it to a variable p1
		persons.add(p1);					// passing the variable to the persons list 
		
		
		/* 
		 * Line number 13 and 14 is combined to form Line number 20.
		 * Creating a new object and allocating memory
		 * without assigning it to a variable we are directly adding it to the persons list.
		 * Here the memory address is different .
		 * (ie) Both the id name and age is same as line 13 and 14 but both pointing different memory address
		 */
		persons.add(new Person(1, "Jas", 6));
		persons.add(new Person(2, "Saras", 33));
		persons.add(new Person(3, "Tarun", 10));
		persons.add(new Person(4, "Sakthi", 38));
		persons.add(new Person(5, "Sri", 10));  
		persons.add(new Person(10, "Sid", 5));
		
	/*	System.out.println(persons.get(2));
		System.out.println();
		
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println();
		
		persons.add(3, (new Person(4, "Kumar", 38)));
		
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println();
		
		persons.remove(1);
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println(); */
		
		persons.remove(new Person(10, "Sid", 5));
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println();
	}

}
