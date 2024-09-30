package com.sup2;

public class NewChild extends NewParent
{
	String city;
	
	public NewChild(String name, String id, String city)
	{
		super(name,id);
		this.city=city;
	}
	
	public void print_info()
	{
		System.out.println(name+" "+id+" "+city);
		super.parent_method();
	}

}
