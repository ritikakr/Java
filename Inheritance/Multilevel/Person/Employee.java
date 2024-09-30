package com.multilevelperson;

public class Employee extends Person
{
	String name,city;
	double sal;
	
	public void info(String name, String city, double sal)
	{
		System.out.println("Employee Info");
		System.out.println("Name:" + name + " " + "sal:" + sal + " " + "city:" + city);
	}
	
}
