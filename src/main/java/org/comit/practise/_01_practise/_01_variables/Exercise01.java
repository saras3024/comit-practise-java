package org.comit.practise._01_practise._01_variables;

import org.comit.practise._01_practise._08_oop.Person1;

public class Exercise01 extends Person1{
	protected Exercise01(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void display()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Person1 obj = new Person1(4);
		obj.setAge(5);
		System.out.println(obj.getAge());
		

	}
}