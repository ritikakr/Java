package com.abstraction;

public abstract class Shape 
{
	Shape()
	{
		System.out.println("We are in Shape Constructor");
	}
	
	public void msg()
	{
		System.out.println("Shape is Circle");
	}
	
	abstract void area();

}
