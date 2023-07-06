package org.comit.practise._01_practise._08_oop;

import java.util.Scanner;

/* Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews 
			and methods for adding and retrieving reviews. */
class Movie{
	
	//Instance variable
	String title;
	String director;
	String actors;
	String reviews;
	
	Scanner input = new Scanner(System.in);
	
	public Movie(String title, String director, String actors) {

		this.title = title;
		this.director = director;
		this.actors = actors;
	}
	
	public void displayMovieDetails()
	{
		System.out.printf("The movie is : %s%nThe Director is: %s%nThe actors are:%s%n", title , director , actors );
	}
	public void addReview()
	{
		System.out.println("Add review for " + title + " movie");
		this.reviews = input.nextLine();		
		input.close();
	}
	public String retrive() {
		return reviews;
	}
	
}

public class MyClassExercise54 {

	public static void main(String[] args) {
		
		Movie mov = new Movie("PS", "Maniratnam", "Ravi,Vikram");
		mov.displayMovieDetails();
		mov.addReview();
		System.out.println("Movie reviews : " + mov.retrive());

	}

}
