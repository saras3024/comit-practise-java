package org.comit.practise._02_operators;

class Exercise14 {

	public static void main(String[] args) {
		// Write a Java program that, given three numbers, prints out the greatest number.
		
		
		int a = 48;
		int b = 78;
		int c = 13;
		String PrintText = "";
		
		if((a > b) && (a > c)) PrintText = Integer.toString(a);
		else if((b > a) && (b > c)) PrintText = Integer.toString(b);
		else PrintText = Integer.toString(c);

		System.out.println( PrintText + " is the greatest number out of " + a + ", " + b + ", " + c);
	}

}
