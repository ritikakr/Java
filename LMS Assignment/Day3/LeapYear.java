package com.day3;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user.
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		
		//condition for leap year.
		//if year is divisible by 4 and 100 then a year is leap year 
		//also, if a year is divisible by 400 then a year is a leap year
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println(year+" "+"is a leap year");
			
		}
		else
		{
			System.out.println(year+" "+"is not a leap year");
		}
		sc.close();
	}

}
