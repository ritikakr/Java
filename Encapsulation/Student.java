package com.encapsulation;

public class Student 
{
	public String name;
	private String password;
	protected String mssg="try to access";
	
	protected void mssg1()
	{
		System.out.println("access outside the class");
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}

}
