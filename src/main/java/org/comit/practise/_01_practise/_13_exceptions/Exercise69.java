package org.comit.practise._01_practise._13_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

enum Operation{
	PLUS("+"), MINUS("-"), MULTIPLICATION("*"), DIVISION("/");
	String operator;
	
	Operation(String operator){
		this.operator =operator; 
	}
	
	String getOperator(){
		return operator;
}
}

class ChooseOperation{
	
	Operation operation;

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
}

public class Exercise69 {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			
			ChooseOperation ope = new ChooseOperation();
			
			input = new Scanner(System.in);
			
			System.out.println("Enter first number");
			int num1 = input.nextInt();
			System.out.println("Enter second number");
			int num2 = input.nextInt();
			
			ope.setOperation(Operation.DIVISION);
			
			String operator = ope.getOperation().getOperator();
			
			System.out.println(operator);
			
			int finalOuput = num1 / num2;
			System.out.println(finalOuput);
		}
		
		catch(ArithmeticException | InputMismatchException e) {
			
			e.printStackTrace();
		}
		
		finally {
			input.close();
		}
		
		

	}

}
