package com.multilevelperson;
import java.util.Scanner;

public class Multi 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		System.out.println("Enter City:");
		String city = sc.nextLine();
		
		System.out.println("Enter Dept:");
		String dept = sc.nextLine();
		
		System.out.println("Enter roll:");
		int roll = sc.nextInt();
		
		System.out.println("Enter Salary:");
		double sal = sc.nextDouble();
		
		s.student_info(name,dept,roll);
		s.info(name,city,sal);
		s.print(name,city,roll);
		
	}

}
