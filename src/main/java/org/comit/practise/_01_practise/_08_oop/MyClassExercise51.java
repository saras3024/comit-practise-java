	/*Write a Java program to create a class called "Book"
	 *  with attributes for the title, author, and ISBN and display() method that prints out the book information.
	 *  In another class, create an array of books, add three books, and print the books in the array. */


package org.comit.practise._01_practise._08_oop;

import java.util.Scanner;

class Book{
	 
	 String title;
	 String author;
	 int isbn;
	 
	 public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void display() {

		System.out.printf("The book title is :%s.%nThe author is : %s.%nThe ISBN is : %s.%n", title , author , isbn);
	}
	
	 	
 }
 
 	class BookArray{
 		
 		String[] book = new String[3];

 		Scanner input = new Scanner(System.in);
 		 
 		 
	 
	 public void enterBookNames() 
	 {
		 for (int i = 1; i <= book.length; ++i)
		 {
				System.out.println("Enter book " + i + " name :");
				book[i - 1] = input.next();
		 }
			input.close();
			

	 }
		 
		 public void displayNames() 
		 {
			 for(int i = 0; i < book.length; ++i)
			 {
				 System.out.println("The book " + (i + 1) + " name is :" + book[i]);
			 }
	     }
 
	 }
	 
	 
 
 
 
 

 public class MyClassExercise51 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("Learn JAVA");
		b1.setAuthor("Jamie Chan");
		b1.setIsbn(123456);
		b1.display();
		
		BookArray b2 = new BookArray();
		b2.enterBookNames();
		b2.displayNames();

	}

}
