package com.sup;

public class Child extends Parent
{
	String name="Child";
	
	public void print_info()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.parent();
	}
	
}

