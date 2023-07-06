package org.comit.practise._01_practise._05_scan;

import java.util.Scanner;

public class Exercise34 {

	//public static void main(String[] args)
	public void calculator()
	{
		// Make a calculator.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1 = input.nextDouble();
		
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Enter the operator : (+) / (-) / (*) / (/) / (%) ");
		String ope = input.nextLine();
		
		/*    switch(ope) 
		    {
			case " + " -> {System.out.println("The sum of " + num1 + " and " + num2 + " is : " + (num1 + num2));}
			case " - " -> {System.out.println("The subtraction of " + num1 + " and " + num2 + " is : " + (num1 - num2));}
			case " * " -> {System.out.println("The multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));}
			case " / " -> {System.out.println("The division of " + num1 + " and " + num2 + " is : " + (num1 / num2));}
			case " % " -> {System.out.println("The mod of " + num1 + " and " + num2 + " is : " + (num1 % num2));}
			
			default -> {System.out.println("Enter a valid operator"); }    
		    }*/
		
		switch(ope) {
		case "+" :
					{ System.out.println("The sum of " + num1 + " and " + num2 + " is : " + (num1 + num2));
					break;}
		case "-" :
					{ System.out.println("The subtraction of " + num1 + " and " + num2 + " is : " + (num1 - num2));
					break;
					}
		case "*" :
					{System.out.println("The multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));
					break;}	
		case "/" :
					{System.out.println("The division of " + num1 + " and " + num2 + " is : " + (num1 /num2));
					break;}
		case "%" :
					{System.out.println("The mod of " + num1 + " and " + num2 + " is : " + (num1%num2));
					break;}
		
		default : 
					{System.out.println("Enter a valid operator");
					}
			
		  }
		 input.close();

}
}
