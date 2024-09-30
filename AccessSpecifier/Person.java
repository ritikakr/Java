package com.eligibility;

public class Person 
{
	private int age;
	
	public int getValue()
	{
		return age;
	}
	 public void setValue(int age)
	 {
		 this.age = age;
		 
		 if(age<=24)
		 {
			 System.out.println("Eligible for the course");
		 }
		 else
		 {
			 System.out.println("Not Eligible for the course");
		 }
	 }

}
