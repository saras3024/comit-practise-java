package org.comit.practise._01_practise._10_interface;


/* Write a Java program to create a banking system with three classes - Bank, SavingsAccount, and CheckingAccount. 
 * The bank class must have an array of accounts and methods for adding them.
 *  Account should be an interface with methods to deposit, withdraw, calculate interest, and view balances. 
 *  SavingsAccount and CheckingAccount should implement the Account interface and have their unique methods. */

interface Account{

	void deposit(double amount);
	void withdraw(double amount);
	double calculateInterest();
	void viewBalance();

}

class Parent{
	public void print() {
		System.out.println("test");
	}
}

class SavingsAccount extends Parent implements Account {
	
	double balance;
	
	@Override
	public void deposit(double amount) {
	this.balance = balance + amount;	
	}

	@Override
	public void withdraw(double amount) {
	this.balance = balance - amount;
	}

	@Override
	public double calculateInterest() {
		balance = balance + (balance * 0.1);
		return this.balance;
	}

	@Override
	public void viewBalance() {
		System.out.println("Savings Account balance is " + this.balance);
	}
	
	public void display() {
		System.out.println("Methods not in interface");
		
	}
	@Override
	public void print() {
		System.out.println("test");
	}
}
	
class CheckingAccount implements Account{
	
	double balance;

	@Override
	public double calculateInterest() {
		balance = balance + (balance * 0.5);
		return balance;
	}

	@Override
	public void viewBalance() {
		System.out.println("Checking Account balance is " + balance);
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;	
		
	}

	@Override
	public void withdraw(double amount) {
		balance = balance - amount;
		
	}
	
}

class Bank{
	
	Account[] accounts;
	
	Bank(){
		accounts = new Account[10];
	}
	
	void addAccount(Account account) {
		for(int i = 0; i < accounts.length; ++i) {
			if(accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
	}
	
	void viewBalance() {
		for(int i = 0; i <accounts.length; ++i) {
			if(accounts[i] != null) {
				accounts[i].viewBalance();
			}
		}
	}
}

public class Exercise65{
	
	public static void main(String[] args) {
		
		
	/*	Parent p1 = new Parent();
		p1.print();	*/
		
		Account s1 = new SavingsAccount();
		s1.deposit(150);
	
		
		Account c1 = new CheckingAccount();
		c1.deposit(130);
		
		Account s2 = new SavingsAccount();
		s2.deposit(170);
		
		((SavingsAccount)s1).display();	
		((SavingsAccount)s1).print(); // always try to override the parent method and invoke using child object.
										// no need to allocate memory for parent class like this parent p1 = new Parent();
		
		
		Bank b1 = new Bank();
		
		b1.addAccount(s1);
		b1.addAccount(c1);
		b1.addAccount(s2);
		
		b1.viewBalance();
	}
}