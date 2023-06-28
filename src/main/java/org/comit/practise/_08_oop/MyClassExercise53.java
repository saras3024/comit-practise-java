package org.comit.practise._08_oop;
/* Write a Java program to create a class called "Employee" with a name, job title, salary attributes, 
 * and methods to retrieve and update the salary. */

	class Employee{
		
		String name;
		String jobTitle;
		double salary;
		public Employee(String name, String jobTitle, double salary) {
			
			this.name = name;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}
		
		public void display()
		{
			System.out.printf("The name is : %s.%nThe job title is :%s.%nThe salary is %.2f%n", name, jobTitle , salary);
		}
		
		public double updatedSalry(double percentage)
		{
			double newSalary = salary + (salary * (percentage / 100));
			return newSalary;
		}
		
	}
	public class MyClassExercise53 {

		public static void main(String[] args) {
			Employee emp = new Employee("Bablu", "Manager",85000);
			emp.display();
			System.out.println("The updated salary is : " + emp.updatedSalry(25.25));

	}

}
