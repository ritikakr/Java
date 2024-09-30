package com.multilevelperson;

public class Student extends Employee
{
	String name,dept;
	int roll;
	
	public void student_info(String name, String dept, int roll)
	{
		System.out.println("Students info");
		System.out.println("Name:" + name + " " + "Dept:" + dept + " " + "roll:" + roll);
	}

}
