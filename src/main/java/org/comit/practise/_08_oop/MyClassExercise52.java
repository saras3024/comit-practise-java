package org.comit.practise._08_oop;

import java.util.Scanner;

/*  
 * Write a Java program to create a class called "TrafficLight" with attributes for colour 
 * and duration and methods to change the colour and check for red or green*/
	class TrafficLight{
		
		String colour; //instance variable
		int duration;
		
		Scanner input = new Scanner(System.in);
		
		//setter method to assign values 
		public void setColour(String colour) {
			this.colour = colour;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		//displaying the assigned colour and duration
		public void dispaly()
		{
			System.out.printf("The colour is : %s.%nThe duration is :%s.%n", colour , duration);
		}
		
		public void dispaly1()
		{
			System.out.printf("The colour is : %s.%n", colour);
		}
		//method to change colour depending upon the duration
		public void changeColour()
		{
			
			System.out.println("Enter the  traffic colour");
			String light  = input.nextLine();
			System.out.println("Enter the duration ");
			int duration = input.nextInt();
			
			switch(light){
			case "green":
			{
				if(duration >= 1)
					{this.colour = "green";}
				else 
					{this.colour = "orange";}

				break;
			}
			case"orange":
			{
				if(duration >= 1) 
					{this.colour = "orange";}

				else 
					{this.colour = "red";}
 
				break;
			}
			case"red":
			{
				if(duration >= 1) 
					{this.colour = "red";}

				else
					{this.colour = "green";}
				
				
			}
			
			}
			input.close();
			
		}}
	
	
public class MyClassExercise52 {

	public static void main(String[] args) {
		TrafficLight tl = new TrafficLight();
		tl.setColour("green");
		tl.setDuration(15);
		tl.dispaly();
		tl.changeColour();
		tl.dispaly1();

	}

}
