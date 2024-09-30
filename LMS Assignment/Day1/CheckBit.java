package com.bit;
import java.util.Scanner;

public class CheckBit 
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();

	    System.out.print("Enter the bit position (starting from 0): ");
	    int n = sc.nextInt();

	    if ((num & (1 << n)) != 0) 
	    {
	            System.out.println("The " + n + "th bit is set (1).");
	      }
	    else 
	    {
	        System.out.println("The " + n + "th bit is not set (0).");
	      }

	}
	 
}

