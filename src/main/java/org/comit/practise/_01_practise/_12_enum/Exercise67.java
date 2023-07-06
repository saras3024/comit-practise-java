package org.comit.practise._01_practise._12_enum;

/* Write a Java program to create an enum called "DaysOfWeek," representing the days of the week. */
//this is simple example


enum Daysofweek{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}


enum Dayswithpara{
	SUNDAY(1,"holiday"), MONDAY(2,"working day"), TUESDAY(3,"working day"), WEDNESDAY(4,"working day"), THURSDAY(5,"working day"), FRIDAY(6,"working day"), SATURDAY(7,"holiday");
	
	int number; // is it mandatory to declare the variable 
	String detail;				//inside enum as  private and static?
	
	Dayswithpara(int num,String detail) {  //creating constructor the parameters passed inside enum
		this.number = num;
		this.detail = detail;
	}
	
	int dayNumber() {
		return this.number;
	}
	
	String dayDetail() {
		return this.detail;
	}
}

class ChooseDays{
	
	Daysofweek days;
	Dayswithpara paradays;

	public Dayswithpara getParadays() {
		return paradays;
	}

	public void setParadays(Dayswithpara paradays) {
		this.paradays = paradays;
	}

	public Daysofweek getDays() {
		return days;
	}

	public void setDays(Daysofweek days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "ChooseDays [days=" + days + "]";
	}

	
}

public class Exercise67 {

	public static void main(String[] args) {
		
		ChooseDays choosedays = new ChooseDays();
		
		choosedays.setDays(Daysofweek.SUNDAY);
		
		System.out.println(choosedays);
		
		choosedays.setParadays(Dayswithpara.MONDAY);
		int daynum = choosedays.getParadays().dayNumber();
		System.out.println(daynum);
		
		String daydetail = choosedays.getParadays().dayDetail();
		System.out.println(daydetail);
	}

}
