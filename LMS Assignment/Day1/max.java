package com.largestNumber;
import java.util.Scanner;

public class max 
{
	public void max(int num1, int num2)
	{
		int max=(num1 > num2 ? num1 : num2);
		System.out.println("Maximum no is:"+max);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		max m = new max();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First no is:");
		int a = sc.nextInt();
		
		System.out.print("Second no is:");
		int b = sc.nextInt();
		
		m.max(a,b);

	}

}
