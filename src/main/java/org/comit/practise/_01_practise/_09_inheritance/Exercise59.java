package org.comit.practise._01_practise._09_inheritance;

/* Write a Java program to create a base class Sports with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. 
 * Override the play() method in each subclass to play a specific statement for each sport.*/

class Sports{
	int matchNo;
	
	Sports(){
		
	}
	
	
	public Sports(int matchNo) {
		super();
		this.matchNo = matchNo;
		System.out.println("Match no : " + this.matchNo);
	}
	
	void play() {
		System.out.println("Playing sports is good for health");
	}

}

class Football extends Sports{
	String name;
	int matchNo;

	public Football(int matchNo1, int matchNo2) {
		super(matchNo1);
		this.matchNo = matchNo2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void play() {
		super.play();
		System.out.println(super.matchNo);
		System.out.println(getName() + " playing matchno : " + matchNo);
	}
}


class Basketball extends Sports{
	int matchNo;
	String name;
	String groundName;
	

	Basketball(int matchNo1,int matchNo3,String name) {
		super(matchNo1);
		this.matchNo = matchNo3;
		this.name = name;
	}


	public String getGroundName() {
		return groundName;
	}


	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
		
		@Override
		void play() {
			super.play();
			System.out.println(name + " playing Basketball at " +getGroundName()+ " and the match no is : " + matchNo);
	}
	
	
}

class Rugby extends Sports{

	int matchNo;
	String name;
	String coachName;
	
	/*If we are calling non-parameterized parent constructor [super();] 
	 * in child constructor, then you have create non parameterized parent constructor manually
	 *  or else you will get this error [Implicit super constructor Sports() is undefined. 
	 *  Must explicitly invoke another constructor]*/
	
	
	public Rugby(int matchNo2, String name, String coachName) {
		super();						//If we didn't specify or passed parameters super will call the 
		this.matchNo = matchNo2;					//non-parameterized parent constructor 
		this.name = name;
		this.coachName = coachName;
	}
	
	@Override
	void play() {
		super.play();
		System.out.println(name + " playing Rugby with " +coachName+ " and the match no is : " + matchNo);
}
	
	
	
}	
public class Exercise59 {

	public static void main(String[] args) {
		
		Sports sport = new Sports(1);
		sport.play();
		
		Football football = new Football(2,3);
		football.setName("Tarun");
		football.play();
		
		Basketball basketball = new Basketball(4,5,"Jas");
		basketball.setGroundName("Bluequill ground");
		basketball.play();
		
		Rugby rugby = new Rugby(6, "Sakthi", "John");
		rugby.play();
		

	}

}
