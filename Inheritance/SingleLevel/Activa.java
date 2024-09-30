package com.inheritance;

public class Activa 
{
	String name;
	double price;
	
	Activa()
	{
		System.out.println("I have petrol engine");
	}
	
	public void speed()
	{
		System.out.println("100");
	}
	public void bill(String name,double price)
	{
		System.out.println("My NEW Vehicle:"+name+" "+price);
	}
}
