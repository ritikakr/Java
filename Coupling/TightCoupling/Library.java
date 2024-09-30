package com.tightCoupling;

public class Library 
{
	Books b;
	
	Library()
	{
		b=new Books();
	}
	public void write()
	{
		System.out.println("Write in Library");
		b.read();
	}

}
