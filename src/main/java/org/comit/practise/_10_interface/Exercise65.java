package org.comit.practise._10_interface;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/* Write a Java program to create a banking system with three classes - 
 * Bank, SavingsAccount, and CurrentAccount. 
 * 
 * The bank class must have an array of accounts and methods for adding them. 
 * 
 * Account should be an interface with methods to deposit, withdraw, 
 * calculate interest, and view balances. 
 * 
 * SavingsAccount and CheckingAccount should implement the Account interface
 *  and have their unique methods. */


class Bank {
	
	int[] accounts = new int[10];
	Scanner input = new Scanner(System.in);
	
	public void addAccount() {
		
		System.out.println("Howmany accounts do you want to add?");
		int num = input.nextInt();

		for(int i = 0; i < num; ++i)
		{			
			System.out.println("Enter the account number : " + (i + 1));

			for(int temp : accounts) 
			{
				if(temp == 0) 
				{
					accounts[i] = input.nextInt();
					break;
				}
			}
		}
		input.close();
			
		}

	
	public void display() {
	System.out.println(Arrays.toString(accounts));
	}
	
}


interface Account{
	void deposit();
	void withdraw();
	double interest();
	double balance();
}

class SavingsAccount implements Account{

	double depositAmount;
	double interest;
	double withdraw;
	double balance;
	
	Scanner input = new Scanner(System.in);
	
	@Override
	public void deposit() {
		
		System.out.println("Howmuch amount do you want to deposit?");
		this.depositAmount = input.nextDouble();
		System.out.println("you have deposited : $" + depositAmount);
		
	}

	@Override
	public void withdraw() {
		System.out.println("you have $" + (this.depositAmount + interest) + "in your  savings account");
		System.out.println("Howmuch do you want to withdraw?");
		this.withdraw = input.nextDouble();
		System.out.println("The balance amount is : " + balance());
		
		
	}

	@Override
	public double interest() {
		interest = depositAmount * 0.1;
		return interest;
	}

	@Override
	public double balance() {
		balance = depositAmount + interest - withdraw;
		return balance;
	}
	input.close();
}

class CheckingAccount implements Account{
	
	double depositAmount;
	double interest;
	double withdraw;
	double balance;
	
	Scanner input = new Scanner(System.in);

	@Override
	public void deposit() {
		System.out.println("You can deposit maximum upto $100_000 in checking account");
		System.out.println("Howmuch amount do you want to deposit?");
		this.depositAmount = input.nextDouble();
		System.out.println("you have deposited : $" + depositAmount);
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("you have $" + (this.depositAmount + interest) + "in your  checking account, "
				+ "you can withdraw upto" +  ((this.depositAmount + interest) / 2));
		System.out.println("Howmuch do you want to withdraw?");
		this.withdraw = input.nextDouble();
		System.out.println("The balance amount is : " + balance());
		
	}

	@Override
	public double interest() {
		interest = depositAmount * 0.01;
		return interest;
	}
	@Override
	public double balance() {
		balance = depositAmount + interest - withdraw;
		return balance;
	}
	
}

public class Exercise65 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount();
		bank.display();
		
		SavingsAccount savingsaccount = new SavingsAccount();
		
		savingsaccount.deposit();
		
		System.out.println("The interest is : " + savingsaccount.interest());
		
		savingsaccount.withdraw();
		
		System.out.println("Your Saving account balance is : " + savingsaccount.balance());
		
		CheckingAccount checkingaccount = new CheckingAccount();
		checkingaccount.deposit();
		System.out.println("The interest is : " + checkingaccount.interest());
		
		checkingaccount.withdraw();
		
		System.out.println("Your checking account balance is : " + checkingaccount.balance());
		
		

	}

}
