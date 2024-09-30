package com.eligibility;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person p = new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Students age:");
		int age=sc.nextInt();
		
		p.getValue();
		p.setValue(age);
		
		

	}

}
