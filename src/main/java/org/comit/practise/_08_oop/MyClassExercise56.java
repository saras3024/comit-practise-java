package org.comit.practise._08_oop;

import java.util.Arrays;

/* Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
 *  and methods to add and remove courses */

class Student{

	String name;
	String grade;
	String[] course;
	
	Student(String name, String grade) {
	
		this.name = name;
		this.grade = grade;
		this.course = new String[10];
	}
	
	public void addCourses(String cour)
	{
		for(int i = 0; i <this.course.length; ++i) {
			if(this.course[i] == null) {
				this.course[i] = cour;
				break;
			}
		}
	}
	
	public void removeCourses(int index) {
		this.course[index] = null;
	}
	public String toString() {
		return String.format("Student name = %s, grade = %s,and courses = %s",name,grade,Arrays.toString(this.course));
	}
	
	
	
}






public class MyClassExercise56 {

	public static void main(String[] args) {
		
		Student stu = new Student("Tarun", " Grade - 4");
		stu.addCourses("Mathematics");
		stu.addCourses("Science");
		stu.removeCourses(0);
		System.out.println(stu);
		
		
	
	}
}
