package org.comit.practise._01_practise._04_while_loop;

public class Exercise31 {

	public static void main(String[] args) {
		
		/* Make a program in JAVA that gives as data the enrollment and 5 grades of a student; 
		Print the enrollment, the average and the word "approved" if the student has an average greater than or equal to 6,
		and the word "not approved" otherwise.
		Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable representing student enrollment.
		CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.*/
		
		int mat = 45869;
		double average;
		double cal1 = 5.6;
		double cal2 = 9.8;
		double cal3 = 6.7;
		double cal4 = 7.4;
		double cal5 = 6.6;
		
		average = (cal1 +  cal2 +  cal3 +  cal4 +  cal5) / 5;
		
		System.out.println("The enrollment number is : " + mat);
		System.out.println("The grades of a student are " + cal1 + " , " + cal2 + " , " + cal3 + " , "+ cal4 + " , "+ cal5 + " . ");
		System.out.println();
		if(average > 6 )
		{
			System.out.println("Average of your grade is greater than 6, so you are approved");
		}
		else
			System.out.println("Average of your grade is not greater than 6, so you are not approved");
		

	}

}
