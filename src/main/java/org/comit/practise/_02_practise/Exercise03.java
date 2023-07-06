package org.comit.practise._02_practise;

import java.util.ArrayList;

/* Write a Java program to insert an element into the array list at the first position. */

public class Exercise03 {

	public static void main(String[] args) {
		
		ArrayList<Character> character = new ArrayList<>();
		character.add('s');
		character.add('a');
		character.add('r');
		character.add('a');
		character.add('s');
		
		character.forEach(e -> System.out.println(e));
		
		ArrayList<Boolean> boo = new ArrayList<>();
		boo.add(false);
		boo.add(false);
		boo.add(true);
		boo.forEach(e -> System.out.println(e));
		

	}

}
