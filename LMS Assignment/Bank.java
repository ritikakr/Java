package com.bank;
import java.util.Scanner;

public class Bank 
{
	double amount;
	
	Bank(double amount)
	{
		this.amount=amount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		String mssg = (amount>=withdrawAmount ? "Withdraw Successful":"Witdraw unsucessful");
		
		if(amount>=withdrawAmount)
		{
			amount-=withdrawAmount;
		}
		
		System.out.println(mssg);
		
	}
	
	public void deposit(double depositAmount)
	{
		amount+=depositAmount;
		
		System.out.println("Deposited amount:"+depositAmount);
		System.out.println("Total amount:"+ amount);	
	}
	
	public static void main(String[] args)
	{
		Bank b = new Bank(10000);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter withdraw amount:");
		double withdrawAmount = sc.nextDouble();
		
		b.withdraw(withdrawAmount);
		b.deposit(5000);
		
		
	}

}
