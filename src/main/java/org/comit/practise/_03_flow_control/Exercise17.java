package org.comit.practise._03_flow_control;

public class Exercise17 {

	public static void main(String[] args) {
		
		//Write a Java program for the following scenario: A student will not be allowed to sit in an exam if his attendance is less than 75%. 
		 //Given: the number of classes held and the number of classes attended, print out the percentage of classes attended and if the student is allowed to sit in the exam or not.
		  
		 
		 int classesHeld = 9;
		 int classesAttented = 8;
		 double attendance  = (double)classesAttented / classesHeld  * 100;
		 
		 if(attendance > 75)
			 System.out.printf("your attendance is : %.2f %%. You can write Exam ." , attendance );
		 
		 else
			 System.out.printf("your attendance is : %.2f %%. You cannot write Exam ." , attendance );
		 


	}

}
